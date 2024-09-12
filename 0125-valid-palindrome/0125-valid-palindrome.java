class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // String rev="";
        // for(char i:s.toCharArray()){
        //     rev=i+rev;
        // }
        // if(s.equals(rev)){
        //     return true;
        // }
        // return false;
        int l=0;
        char[] arr=s.toCharArray();
        int r=s.length()-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}