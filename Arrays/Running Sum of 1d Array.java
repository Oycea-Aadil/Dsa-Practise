//problem- Running Sum of 1d Array
//platform-leetcode(1480)
//difficulty-easy
//Approach:sum upto 1+1 will equal to the sum upto i + nums[i+1];
//time complexity-O(N)
//space complexity=O(1)


class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
        
    }
}
