class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        boolean t=false;
        int nn=0;
        int temp=n;
        while(temp!=0){
            int dig=temp%10;
            nn=nn*10+dig;
            temp/=10;
        }
        if(n==nn){
            t=true;
        }
        return t;
    }
}