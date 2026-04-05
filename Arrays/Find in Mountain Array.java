//problem-Find in Mountain Array
//platform-leetcode(1095)
//difficulty-Hard
//Approach:
//used simple binary search to find the largest number and then creat two different methods one for ascending and one for descending to find the target index
//time complexity-O(logN)
//space complexity=O(1)






class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=peakindex(mountainArr);
        if(ascending(mountainArr,n,target)>=0){
            return ascending(mountainArr,n,target);
        }
        else if(descending(mountainArr,n,target)>=0){
            return descending(mountainArr,n,target);
        }
        else {
            return -1;
        }



    }

     static int peakindex( MountainArray mountainArr) {
         int start = 0;
         int end = mountainArr.length() - 1;
         int mid=0;
         while(start<end){
             mid=start+(end-start)/2;
             if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                 start=mid+1;
             }

             else{
                 end=mid;
             }

         }
         return start;

    }
    static int ascending(MountainArray mountainArr,int peakindex,int target){
        int start=0;
        int end=peakindex;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==mountainArr.get(mid)) {
                return mid;
            }
            if(target<mountainArr.get(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return -1;

    }
    static int descending(MountainArray mountainArr,int peakindex,int target){
        int ans=-1;
        int start=peakindex+1;
        int end= mountainArr.length()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>mountainArr.get(mid)){
                end=mid-1;
            }
            else if(target==mountainArr.get(mid)){
                return mid;

            }
            else{
                start=mid+1;

            }
        }
        return -1;

    }}
