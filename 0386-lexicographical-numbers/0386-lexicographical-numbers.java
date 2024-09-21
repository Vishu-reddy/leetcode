class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(String.valueOf(i));
        }
        Collections.sort(arr);
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(Integer.parseInt(arr.get(i)));
        }
        return res;
    }
}