/*
Given a sorted and rotated array arr of n elements and a target key which is rotated at some point, and may contain duplicates and given an element key. Check whether the key is present in array A or not.
Input:
n = 7
arr[] = {2,5,6,0,0,1,2}
key = 0
Output:
1
Explanation:
0 is found at index 3.
*/
class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }

            if(nums[low]<=nums[mid]){
                if(nums[low]<= target && target<=nums[mid]){
                    high=mid-1;

                }else{
                    low=mid+1;
                }

            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
        
    }
}
