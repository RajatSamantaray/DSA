package BinarySeach;
public class SearchAnElementBitonicArray {
    public static int getIndexForPeakValue(int[] arr){
        int min=0,max=arr.length-1,mid=0;
        while(min<=max){
            mid = min+(max-min)/2;
            if(0 < mid && mid < arr.length-1){
                if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                    return mid;
                }else if(arr[mid-1] < arr[mid]){
                    min=mid +1;
                }else{
                    max=mid-1;
                }
            }
            
        }
        return mid;
    }
    public static int getElementFromBitonicArray(int[] arr,int value,char type,int min,int max){
        int mid=-1;
        if(type=='a'){
            while(min<=max){
                mid=min+(max-min)/2;
                if(arr[mid]==value){
                    return mid;
                }else if(arr[mid] < value){
                    min=mid+1;
                }else{
                    max=mid-1;
                }
            }
            return -1;
        }else{
            while(min <= max){
                mid=min+(max-min)/2;
                if(arr[mid]==value){
                    return mid;
                }else if(arr[mid] < value){
                    max=mid-1;
                }else{
                    min=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,17,12,8,6,4,2};
        int index =getIndexForPeakValue(arr);
       // System.out.println(index);
            System.out.println(getElementFromBitonicArray(arr, 5, 'a', 0, index-1));
           System.out.println( getElementFromBitonicArray(arr, 6,'d', index, arr.length-1));
        
    }
}
