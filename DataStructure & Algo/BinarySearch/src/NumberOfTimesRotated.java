package BinarySeach;
public class NumberOfTimesRotated {
    public static int  NoOfTimesRotatedPosition(int[] arr){
        int min = 0,max=arr.length-1,len=arr.length,middle=0;
        while(min<=max){
            middle=min +((max-min)/2);
            int prev =(middle+len-1)%len,aft=(middle+1)%len;
            if(arr[middle]<=arr[prev] && arr[middle]<= arr[aft]){
                return len -middle;
            }else if(arr[middle]<= arr[max]){
                max = middle-1;
            }else if(arr[min] <= arr[middle]){
                min = middle+1;
            }
        }
        return middle;
    }
    public static void main(String[] args) {
        int[] array = {7,8,10,11,15,2,3,5}; 
    System.out.println(NoOfTimesRotatedPosition(array));
}
}
