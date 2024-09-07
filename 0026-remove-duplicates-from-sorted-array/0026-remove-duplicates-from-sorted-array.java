class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=0;
        while(r<nums.length){
            int count=1;
            while(r+1<nums.length && nums[r]==nums[r+1]){
                count++;
                r++;
            }
            for(int i=0;i<Math.min(1,count);i++){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}