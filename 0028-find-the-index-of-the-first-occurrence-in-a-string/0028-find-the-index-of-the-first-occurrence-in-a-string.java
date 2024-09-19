class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<haystack.length()+1-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if(j==needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}