class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans=0;
        while (l < r) {
            int res = 0;
            if (height[l] <= height[r]) {
                res = height[l] * (r - l);
                l++;
            }else{
                res=height[r]*(r-l);
                r--;
            }
            ans=Math.max(res,ans);
        }
        return ans;
    }
}