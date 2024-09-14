class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==1){
            return nums.length;
        }
        int max=0;
        int length=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                count++;
                length=Math.max(length,count);
            }
            else{
                count=0;
            }
        }
        return length;
    }
}