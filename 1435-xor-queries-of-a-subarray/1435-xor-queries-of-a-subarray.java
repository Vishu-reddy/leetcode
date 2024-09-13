class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor=new int[queries.length];
        int[] pre=new int[arr.length];
        // for(int i=0;i<queries.length;i++){
        //     int x=0;
        //     for(int j=queries[i][0];j<=queries[i][1];j++){
        //         x^=arr[j];
        //     }
        //     xor[i]=x;
        // }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                pre[i]=arr[i];
            }
            else{
                pre[i]=arr[i]^pre[i-1];
            }
        }
        int j=0;
        for(int[] i:queries){
            int left=i[0];
            int right=i[1];
            if(left==0){
                xor[j]=pre[right];
                j++;
            }
            else{
                xor[j]=pre[right]^pre[left-1];
                j++;
            }
        }

        return xor;
    }
}