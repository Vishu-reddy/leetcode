class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);

        }
        for(int i:h.keySet()){
            if(h.get(i)>(nums.length)/2){
                return i;
            }
        }
        return 0;
    }
}