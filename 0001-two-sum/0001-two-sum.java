class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer r=h.get(nums[i]);
            if(r!=null){
                return new int[]{r,i};
            }
            h.put(target-nums[i],i);
        }
        return nums;
    }
}