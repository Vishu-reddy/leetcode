class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n=new HashSet<>();
        HashSet<Integer> a=new HashSet<>();
        for(int i:nums1){
            n.add(i);
        }
        for(int k:nums2){
            if(n.contains(k)){
                a.add(k);
            }
        }
        int[] k=new int[a.size()];
        int i=0;
        for(int x:a){
            k[i++]=x;
        }
        return k;
    }
}