class Solution {
    public int minBitFlips(int start, int goal) {
        int[] s=decimalToBinary(start);
        int[] g=decimalToBinary(goal);
        int count=0;
        for(int i=0;i<s.length;i++){
            if(s[i]!=g[i]){
                count++;
            }
        }
        return count;
    }
    public int[] decimalToBinary(int num){
        int[] binary = new int[35];
        int id = 0;
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        //it is binary in reverse but no problem in this problem 
        return binary;
    }
}