class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> res=new HashMap<>();
        List<Integer>[] arr=new List[nums.length+1];
        List<Integer> re=new ArrayList<>();
        for (int num : nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        for(int key:res.keySet()){
            int freq=res.get(key);
            if(arr[freq]==null){
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(key);
        }
        for(int i=nums.length;k>0 && i>=0;i--){
            if(arr[i]!=null){
                for(int num:arr[i]){
                    re.add(num);
                    k--;
                    if(k==0){
                        break;
                    }
                }
            }
        }
            int[] result = new int[re.size()];
    for (int i = 0; i < re.size(); i++) {
        result[i] = re.get(i);
    }
    
    return result;

    }
}