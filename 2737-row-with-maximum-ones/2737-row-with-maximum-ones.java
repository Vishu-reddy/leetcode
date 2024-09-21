class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }

            if(h.get(count)==null){h.put(count,i);}
        }
        for(int i:h.keySet()){
            max=Math.max(max,i);
        }
        return new int[] {h.get(max),max};
    }
}