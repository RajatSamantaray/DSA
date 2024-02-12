package BinarySeach;

import java.util.ArrayList;
import java.util.List;
public class TwoDSortedArray {
    public static List getElementFrom2DArray(int[][] arr,int element){
        int m=arr.length,n=arr[0].length,i=0,j=m-1;
        List list=new ArrayList<>();
        System.out.println(arr[1][0]);
         while(i >= 0 && i<=n && j >= 0 && j <= m ){
            if(arr[i][j] == element){
                list.add(i);
                list.add(j);
                return list;
            }else if(arr[i][j] < element ){
                 i++;
            }else{
                j--;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] arr ={
                {10,20,30,40},
                {12,22,32,42},
                {14,26,34,46},
                {18,29,38,50}};
        System.out.println(getElementFrom2DArray(arr, 46));
  }  
}
