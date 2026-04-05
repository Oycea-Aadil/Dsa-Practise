//problem-peak index in moutain Array
//platform-leetcode/852
//difficulty-Medium
// Approach:
// simple binary search to find the target no. in the Arrays and print its index
//Time complexity-O(logN)
//Space complexity-O(1)







class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            
            else{
                end=mid;
            }

        }
        return start;

    
        
    }
}
