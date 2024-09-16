class Solution {
    public int romanToInt(String s) {
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            int n=num(s.charAt(i));
            if(3*n<res){
                res-=n;
            }else{
                res+=n;
            }
        }
        return res;
    }
    public int num(char i){
        int res=0;
        switch(i){
                case 'I':
                    res+=1;
                    break;
                case 'V':
                    res+=5;
                    break;
                case 'X':
                    res+=10;
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'C':
                    res+=100;
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'M':
                    res+=1000;
                    break;
            }
        return res;
    }
}