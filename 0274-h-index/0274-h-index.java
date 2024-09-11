class Solution {
    public int hIndex(int[] cit) {
        int n=cit.length;
        int[] paper=new int[n+1];
        for(int i=0;i<n;i++){
            paper[Math.min(n,cit[i])]++;
        }
        int h=0;
        for(int i=n;i>0;i--){
            h+=paper[i];
            if(h>=i){
                return i;
            }
        }
        return 0;
    }
}