class Solution {
    public int minOperations(int[] nums) {
        // int n=nums.length;
        int com=1;
        int res=0;
        for( int i:nums){
            if(i!=com){
                res++;
                com=(com+1)%2;
            }
        }
        return res;

    }
}