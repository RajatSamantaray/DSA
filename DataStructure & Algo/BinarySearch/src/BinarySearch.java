// search agnostic Binary Search where linear sorted array and reverse sorted array are same 

public class BinarySearch {
    public static int BinarySerch(int[] array,int searchValue) {
        int linear =0;
        if(array[0] < array[1]){
            linear=1;
        }else{
            linear=-1;
        }
        int index=Integer.MAX_VALUE;
        int min=0;
        int max=array.length;
        if(linear ==1){
        while(min<=max){
            int middle=min +((max-min)/2);
            if(searchValue==array[middle]){
                return middle;
            }else if(array[middle]< searchValue){
                min = middle+1;
            }else{
                max = middle-1;
            }
        }
    }else{
        while(min<=max){
            int middle=min +((max-min)/2);
            if(searchValue==array[middle]){
                return middle;
            }else if(array[middle]< searchValue){
                max = middle+1;
            }else{
                min = middle-1;
            }
        }
    }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 ={10,9,8,7,6,5,4,3,2,1};
        System.out.println(BinarySerch(arr, 2));
    }
    
}
