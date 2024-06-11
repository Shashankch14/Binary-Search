/*
Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).
*/

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        //Floor is the LARGEST NP. IN AN ARRAY<=X
        
        int low=0, high=arr.length-1;
        int floor = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=x){
                floor = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return floor;
    }
    
}
