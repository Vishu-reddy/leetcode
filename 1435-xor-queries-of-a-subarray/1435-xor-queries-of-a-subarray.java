class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int x=0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                x^=arr[j];
            }
            xor[i]=x;
        }
        return xor;
    }
}