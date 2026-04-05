// Problem:First and Last Position of target in Sorted Array
// Platform: LeetCode (34)
// Difficulty: Medium

// Approach:
// used simple binary search to find first position and last position of the target 
//for first position even if you got target still do end =mid-1
//for last postion even if you got the target still do start=mid+1
//both will help to find the first and the last position respectively

// Time Complexity: O(log n)
// Space Complexity: O(1)





class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first=checkF(nums, target);
        int last=checkL(nums,target);
        return new int[]{first,last};


    }
    static int checkF(int[] nums,int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target==nums[mid]){
                ans=mid;
                end=mid-1;

            }
            else{
                end=mid-1;

            }
        }
        return ans;

}
    static int checkL(int[] nums,int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target==nums[mid]){
                ans=mid;
                start=mid+1;

            }
            else{
                end=mid-1;

            }
        }
        return ans;

    }
        
    }
