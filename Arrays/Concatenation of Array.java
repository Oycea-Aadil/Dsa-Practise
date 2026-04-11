//problem-Concatenation of Array
//platform-leetcode(1929)
//difficulty-easy
//Approach:its was a easy question can be easily solve by just loop upto 2N and condition when i>N ans[i]=nums[i-n] means 
//taking element of num to ans from starting again 
//time complexity-O(N)
//space complexity=O(N)


class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            if(i>=nums.length){
                ans[i]=nums[i-nums.length];
            }
            else{
                ans[i]=nums[i];
            }
        }
        return ans;
