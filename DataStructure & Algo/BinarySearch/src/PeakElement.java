package BinarySeach;
public class PeakElement {
    public static int getPeakElement(int[] arr){
        int min=0,max=arr.length-1,mid=0;
        while(min <= max){
            mid = min+(max-min)/2;
            if(mid==arr.length-1){
                if(arr[mid-1]<arr[mid]){
                    return arr[mid];
                }
            }else if(0 == mid){
                if(arr[mid+1]<arr[mid]){
                    return arr[mid];
                }
            }
            else if ( 0 < mid && mid < arr.length-1){
                if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                    return arr[mid];
                }else if(arr[mid-1] < arr[mid]){
                    min = mid+1;
                }else{
                    max = mid-1; 
                }
            }
        }
        return arr[mid];
    }
    public static void main(String[] args) {
        int[] arr = {1,3,13,5,7,9,17,12,16};
        System.out.println(getPeakElement(arr));
    }
}
