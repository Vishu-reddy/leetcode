class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){continue;}
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r])); 
                    l++;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    // while(l<r && nums[r]==nums[r-1]){
                    //     r--;
                    // }
                }
            }
        }
        return res;
    }
}
// sort the array
// in loop select the first element
// in the second loop select other two elements using two sum approch or two sum II approch
//if sum three is 0 add to res list