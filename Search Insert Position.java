/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
(LOWER BOUND)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low =0, high=nums.length-1;

        int lowerBound=nums.length;
        while(low<=high){
            int mid = low+(high-low/2);
            if(nums[mid]>=target){
                lowerBound=mid;
                high= mid-1;
            }else{
                low=mid+1;
            }
        }
        return lowerBound;
        
    }
}
