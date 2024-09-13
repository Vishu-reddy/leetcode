class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer=new int[nums.length];
        int[] pre=new int[nums.length];
        int[] post=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                pre[i]=nums[i];
            }
            else{
                pre[i]=pre[i-1]*nums[i];
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                post[i]=nums[i];
            }
            else{
                post[i]=post[i+1]*nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                answer[i]=post[i+1];
            }
            else if(i==nums.length-1){
                answer[i]=pre[i-1];
            }
            else{
                answer[i]=pre[i-1]*post[i+1];
            }
        }
        return answer;
    }
}
// make two lists
// pre=[]
// post=[]
// ex:-nums=[1,2,3,4]
// then pre=[1,2,6,24]
// and post=[24,24,12,4]
// ans[0]=post[1]
// ans[1]=pre[0]*post[2] 
// ans[nums.length-1]=pre[nums.length-2] and so on...