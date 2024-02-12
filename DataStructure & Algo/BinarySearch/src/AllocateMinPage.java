public class AllocateMinPage{
    public static int getMinAllocPage(int[] booksPages,int students){
        if(booksPages.length<students)
            return -1;
        int min=0,max=0,maxpage=0,midpoint=0;
        for (int noPages: booksPages) {
            maxpage=noPages>maxpage?noPages:maxpage;
            max += noPages;
        }
        min=maxpage;
        while (min <= max){
          int mid = min+(max-min)/2;
            if (isValid(booksPages, booksPages.length, students, mid)) {
                max= mid -1;
                midpoint= mid;
            } else {
                min = mid+1;


            }
        }
        return midpoint;
    }
    public static boolean isValid(int[] arr,int noOfBooks,int noOfStu,int mid){
        int students=1;
        int sum =0;
        for (int noOfPages:arr){
            sum += noOfPages;
            if(mid<sum){
                students +=1;
                sum= noOfPages;
            }
        }
        if(students>noOfStu){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
     System.out.println("welocome");
     int[] noOfBooks= {10,20,30,40,50};
        System.out.println(getMinAllocPage(noOfBooks,2));
    }
}