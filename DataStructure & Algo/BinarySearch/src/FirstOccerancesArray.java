public class FirstOccerancesArray{
    public static int FirstOccerancesArray(int[] arr, int value) {
        int result = -1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        min=0;max=arr.length;
        while(min<=max){
            int middle = min + ((max-min)/2);
            if(arr[middle]==value){
                result=middle;
                max =middle-1;/// for last occerances min=middle+1
            }else if(arr[middle] < value){
                min = middle+1;
            }else{
                max =middle-1;
            }
        }
       return result;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,5,6,7,8};
        System.out.println(FirstOccerancesArray(array, 3));
        int index = FirstOccerancesArray(array, 3);
        // this line is for count the no of occerances
        int count = 0;
        while(array[index]==3){
            count++;
            index++;
        }
        System.out.println(count);
    }
}