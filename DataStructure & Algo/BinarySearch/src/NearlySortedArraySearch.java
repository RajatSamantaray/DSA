package BinarySeach;

public class NearlySortedArraySearch {
    public static int nsortedArraySearch(int[] arr,int value){
        int low = 0,high = arr.length-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid]==value ){
                return mid;
            }else if(mid-1>=0 && arr[mid-1] == value){
                return mid -1;
            }else if(mid+1<=arr.length-1 && arr[mid+1]==value){
                return mid+1;
            }else if(arr[mid]< value){
                low = mid + 1;
            }else if(value < arr[mid]){
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,40,30,70,80,90,100};
        System.out.println(nsortedArraySearch(arr, 150));
    }
}
