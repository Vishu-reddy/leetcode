class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> h=new HashMap<>();
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        for(String i:arr1){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(String i:arr2){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        ArrayList<String> res=new ArrayList<>();
        for(String s:h.keySet()){
            if(h.get(s)==1){
                res.add(s);
            }
        }
        String[] r=new String[res.size()];
        for(int i=0;i<res.size();i++){
            r[i]=res.get(i);
        }
        return r;
    }
}