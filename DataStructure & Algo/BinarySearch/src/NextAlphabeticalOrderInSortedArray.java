package BinarySeach;
public class NextAlphabeticalOrderInSortedArray {
    public static char nxtAlphabeticalOrderInSortedArray(char[] arr,char value){
        char nxtChar=Character.MAX_VALUE;
        int min=0,max=arr.length-1,mid;
        while(min<=max){
            mid = min +(max-min)/2;
            if(Character.compare(arr[mid], value)==0){
                return arr[mid+1];
            }else if( Character.compare(arr[mid],value) < 0 ){
                min = mid + 1;
                
            }else if(Character.compare(arr[mid],value) > 0){
                max = mid -1;
                nxtChar=arr[mid];
            }
        }
        return nxtChar;
    }
    public static void main(String[] args) {
        char[] arr = {'a','b','d','e','h','k','i','j','k'};
        
        System.out.println(nxtAlphabeticalOrderInSortedArray(arr, 'e'));
    }
}
