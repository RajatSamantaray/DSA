package BinarySeach;
public class MinDiffElement {
    public static int minDiffElementSortedArray(int[] arr,int value){
        int min = 0,max=arr.length-1,mid=0;
        while(min<=max){
            mid = min+(max-min)/2;
            if(arr[mid]==value)
            return arr[mid]-value;
            else if(arr[mid]<value)
            min=mid+1;
            else
            max=mid-1;

        }
        return Math.abs(value-arr[min]) < Math.abs(value-arr[max]) ? min : max;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,13,16,17};
        System.out.println(minDiffElementSortedArray(arr, 11));

    }
}
