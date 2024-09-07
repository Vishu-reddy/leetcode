class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<= 2){
            return nums.length;
        }
        int l=0;
        int r=0;
        while(r<nums.length){
            int count=1;
            while(r+1<nums.length && nums[r]==nums[r+1]){
                r++;
                count++;
            }
            for(int i=0;i<Math.min(2,count);i++){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}