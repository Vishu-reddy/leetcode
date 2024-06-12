class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char chars=s.charAt(i);
            char chart=t.charAt(i);
            if(hm.containsKey(chars)){
                if(hm.get(chars)!=chart){
                    return false;
                }
            }
            else{
                if(hm.containsValue(chart)){
                    return false;
                }
                hm.put(chars,chart);
            }
            
        }
        return true; 
    }
}