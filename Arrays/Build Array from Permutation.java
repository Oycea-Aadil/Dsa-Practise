//problem-Build Array from Permutation
//platform-leetcode(1920)
//difficulty-easy
//Approach:the question was simply solve by the loop by using the formula result[i] =num[num[i]]
//time complexity-O(N)
//space complexity=O(N)



class Solution {
    public int[] buildArray(int[] nums) {
        
         int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }
}
