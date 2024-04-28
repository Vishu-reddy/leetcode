class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<=1){
            return false;
        }
        HashMap<Integer,Integer> ha= new HashMap<>();
        for(int i:nums){
            if(ha.containsKey(i)){
                return true;
            }
            ha.put(i,1);
        }
        return false;
    }
}