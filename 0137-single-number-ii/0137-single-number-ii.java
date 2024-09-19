class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}