package BinarySeach;
public class FloorOfElementInSortedArray {
    public static int floorElementOfSortedArray(int[] arr,int value){
        int min = 0,max = arr.length -1,ciel = 0,flr = 0;
        while(min <= max){
            int mid = min+(max-min)/2;
            if(arr[mid] ==value){
                return mid;
            }else if(arr[mid]>value){
                // if(ciel == mid-1){
                //     return ciel;
                // }
                ciel=mid;
                max = mid -1;
            }else if(arr[mid] < value){
                flr= mid;  
                min = mid +1;
            }
        }
        return ciel;
    }
    public static void main(String[] args) {
        int[] arr ={0,1,2,4,6,8,10};
        System.out.println(floorElementOfSortedArray(arr, 9));
    }
}
