package BinarySeach;

public class ElemenInRotatedSortedArray{
    public static int search(int[] arr,int minimum,int maximum, int value){
        int min = minimum,max = maximum;
        while(min <= max){
            int mid =(min+(max-min))/2;
            if(arr[mid] == value){
                return mid;
            }else if(arr[mid] < value){
                min=mid + 1;
            }else{
                max=mid-1;
            }
        }
        return -1;
    }
    public static int rotatedSortedArray(int[] arr ,int value){
        int n= arr.length -1 ,low = 0, high = n - 1;
        while (low <= high) {
 
            // if first element is mid or
            // last element is mid
            // then simply use modulo so it
            // never goes out of bound.
            int mid = low + (high - low) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
 
            if (arr[mid] <= arr[prev]
                && arr[mid] <= arr[next])
                return mid;
            else if (arr[mid] <= arr[high])
                high = mid - 1;
            else if (arr[mid] >= arr[low])
                low = mid + 1;
        }
        return 0;
    }
        
        
        
     
    public static void main(String[] args) {
        
        int[] array = {7,8,10,11,15,2,3,5};
        //System.out.println(NumberOfTimesRotated.NoOfTimesRotatedPosition(array));
        System.out.println(rotatedSortedArray(array, 11));
        // if(arr[noOfRot]<=value && value <= arr[arr.length-1]){
        //     return search(arr,noOfRot,arr.length-1,value);
        // }else if(arr[0]<=value && value <= arr[noOfRot]){
        //     return search(arr,0,noOfRot,value);
        // }
    }
}