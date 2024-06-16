class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chr=strs[i].toCharArray();
            Arrays.sort(chr);
            String ss=new String(chr);
            if(!res.containsKey(ss)){
                res.put(ss,new ArrayList<String>());
                res.get(ss).add(strs[i]);
            }
            else{
                res.get(ss).add(strs[i]);
            }
        }
        return new ArrayList<>(res.values());
    }
}