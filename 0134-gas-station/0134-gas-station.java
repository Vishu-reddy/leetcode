class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas)<sum(cost)){
            return -1;
        }
        int tot=0;
        int res=0;
        for(int i=0;i<gas.length;i++){
            tot+=gas[i]-cost[i];
            if(tot<0){
                tot=0;
                res=i+1;
            }
        }
        return res;
        
    }
    public int sum(int [] arr){
        int s=0;
        for(int i:arr){
            s+=i;
        }
        return s;
    }
}