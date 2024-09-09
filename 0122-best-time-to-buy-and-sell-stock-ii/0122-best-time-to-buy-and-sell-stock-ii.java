class Solution {
    public int maxProfit(int[] p) {
        int profit=0;
        for(int i=0;i<p.length-1;i++){
            if(p[i]<p[i+1]){
                profit+=(p[i+1]-p[i]);
            }
        }
        return profit;
    }
}