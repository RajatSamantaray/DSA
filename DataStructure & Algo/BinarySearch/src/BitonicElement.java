public class BitonicElement {
    public static int getElementFromBitonicArray(int[] arr) {
        int len=arr.length-1,min=0,max=len,mid=0;
        while(min<=max){
            mid=min+(max-min)/2;
            if(0 < mid && mid < len){
                if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid]){
                    return arr[mid];
                }else if(arr[mid-1]<arr[mid]){
                    min=mid+1;
                }else if(arr[mid]>arr[mid+1]){
                    max=mid-1;
                }
            }
        }
        return arr[mid];

    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,17,12,8};
        System.out.println(getElementFromBitonicArray(arr));
    }
}
