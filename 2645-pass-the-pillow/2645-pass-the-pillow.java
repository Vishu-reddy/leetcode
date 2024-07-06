class Solution {
    public int passThePillow(int n, int time) {
        boolean flag=true;
        int stand=1;
        while(time!=0){
            time-=1;
            if(flag){
                stand++;
                if(stand==n){
                    flag=false;
                }
            }
            else{
                stand--;
                if(stand==1){
                    flag=true;
                }
            }
        }
        return stand;
    }
}