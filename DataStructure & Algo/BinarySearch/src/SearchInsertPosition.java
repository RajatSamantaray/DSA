/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
* */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int result = nums.length, min = 0, max = nums.length-1, mid = 0;
        while (min <= max) {
            mid =min+(max-min)/2;
            if(nums[mid] == target ){
                return mid;
            }else if(nums[mid]<target){
                min = mid +1;

            }else{
                max = mid -1;
                result=mid;
            }
        }
        return result;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = 0;
        int columnIndex = matrix[0].length - 1;
        while (columnIndex >= 0 && rowIndex <= matrix.length - 1) {
            int currentValue = matrix[rowIndex][columnIndex];
            if (currentValue == target) {
                return true;
            }

            if (currentValue < target) {
                rowIndex++;
            } else {
                columnIndex--;
            }
        }
        return false;
    }
    public static boolean search(int[] nums, int target) {
        int n = nums.length-1, low = 0,high= n ,mid = 0;
        while (low <= high){
            mid=low+(high -low)/2;
            if(nums[mid]==target){
                return true;
            }else if (nums[low]<nums[mid]){
                if(nums[low]<target && nums[mid] < target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }else if(nums[low]>nums[mid]){
                if(nums[low] > target && nums[mid] >target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                low +=1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int[][] arr1 ={{1,3,5,7},{9,11,13,15},{17,19,21,23}};
        int[] arr2 = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(search(arr2,6));
        //System.out.println(searchMatrix(arr1,19));
       // System.out.println(searchInsert(arr,4));
    }
}
