class Solution {
    public int findMaxK(int[] nums) {
        int res=-1;
        Set<Integer> n=new HashSet<>();
        for(int num:nums){
            n.add(num);
        }
        for(int num:n){
            if(n.contains(-num)){
                res=Math.max(res,num);
            }
        }
        return res;
    }
}