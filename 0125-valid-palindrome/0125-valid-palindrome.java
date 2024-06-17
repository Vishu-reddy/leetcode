class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String rev="";
        for(char i:s.toCharArray()){
            rev=i+rev;
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}