class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numset=new HashSet<>();
        int longest=0;
        for(int i:nums){
            numset.add(i);
        }
        for(int i:nums){
            if(!numset.contains(i-1)){
                int length=0;
                while(numset.contains(i+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}