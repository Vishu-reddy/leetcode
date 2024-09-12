// class Solution {
//     public int trap(int[] height) {
//         if(height.length==0){
//             return 0;
//         }
//         int l=0,r=height.length-1;
//         int ml=height[l],mr=height[r];
//         int res=0;
//         while(l<r){
//             if(height[l]<=height[r]){
//                 l++;
//                 int w=ml-height[l];
//                 if(w>0){
//                     res+=w;
//                 }
//                 ml=Math.max(ml,height[l]);
//             }
//             else{
//                 r--;
//                 int w=mr-height[r];
//                 if(w>0){
//                     res+=w;
//                 }
//                 mr=Math.max(mr,height[r]);
//             }
//         }
//         return res;
//     }
// }
// class Solution {
//     public int trap(int[] height) {
//         int l=0;
//         int r=height.length-1;
//         int ml=height[l];
//         int mr=height[r];
//         int res=0;
//         while(l<r){
//             if(height[l]<height[r]){
//                 l++;
//                 int w=ml-height[l];
//                 if(w>0){
//                     res+=w;
//                 }
//                 ml=Math.max(ml,height[l]);
//             }
//             else{
//                 r--;
//                 int w=mr-height[r];
//                 if(w>0){
//                     res+=w;
//                 }
//                 mr=Math.max(mr,height[r]);
//             }

//         }
//         return res;
//     }
// }
class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int ml=height[l];
        int mr=height[r];
        int res=0;
        while(l<r){
            if(height[l]<height[r]){
                l++;
                int w=ml-height[l];
                if(w>0){
                    res+=w;
                }
                ml=Math.max(ml,height[l]);
            }
            else{
                r--;
                int w=mr-height[r];
                if(w>0){
                    res+=w;
                }
                mr=Math.max(mr,height[r]);
            }
        }
        return res;
    }
}