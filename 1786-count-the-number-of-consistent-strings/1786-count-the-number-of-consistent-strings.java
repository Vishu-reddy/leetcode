class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> sall=new HashSet<>();
        for(char c:allowed.toCharArray()){
            sall.add(c);
        }
        for(String s:words){
            boolean contains=true;
            for(char c:s.toCharArray()){
                if(!sall.contains(c)){
                    contains=false;
                    break;
                }
            }
            if(contains){
                count++;
            }
        }
        return count;
    }
}