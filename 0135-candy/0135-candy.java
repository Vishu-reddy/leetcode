class Solution {
    public int candy(int[] rating) {
        int n=rating.length;
        int[] candies=new int[n];
        for(int i=0;i<rating.length;i++){
            candies[i]=1;
        }
        for(int i=1;i<n;i++){
            if(rating[i]>rating[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(rating[i]>rating[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int res=0;
        for(int i:candies){
            res+=i;
        }
        return res;
    }
}