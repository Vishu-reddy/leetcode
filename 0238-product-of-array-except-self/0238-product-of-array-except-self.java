class Solution {
    public int[] productExceptSelf(int[] nums) {
        // brootfroce
        int[] answer=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int c=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(j!=i){
        //             c*=nums[j];
        //         }
        //     }
        //     answer[i]=c;
        // }
        // return answer;
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
            answer[i]=pre[i-1]*post[i+1];}
        }
        return answer;
    }
}