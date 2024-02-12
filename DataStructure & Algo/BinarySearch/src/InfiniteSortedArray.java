package BinarySeach;
public class InfiniteSortedArray {
    public static int infiniteSortedArrValue(int[] arr,int value ){
        int min = 0,max=1,mid = 0;
        while(min<=max){
            mid = min+(max-min)/2;
            if(arr[mid]==value){
               return mid ;
            }else if(arr[mid]<= value){
                min =max;
                if(max*2 < arr.length-1)
                    max = max * 2;

            }else if(value <= arr[mid]){
                max = mid -1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,5,7,9,10,12,14,16,18};
       System.out.println(infiniteSortedArrValue(arr, 7));
    }
}
