class Solution {
    public int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<min){
                min=p[i];
            }
            else{
                max=Math.max(max,p[i]-min);
            }
        }
        return max;
    }
}