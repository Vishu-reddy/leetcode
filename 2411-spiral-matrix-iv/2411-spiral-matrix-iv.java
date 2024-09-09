/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res=new int[m][n];
        ListNode curr=head;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=-1;
            }
        }
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(curr!=null && left<=right && top<=bottom){
            for(int i=left;i<=right && curr!=null;i++){
                res[top][i]=curr.val;
                curr=curr.next;
            }
            top++;
            for(int j=top;j<=bottom && curr!=null;j++){
                res[j][right]=curr.val;
                curr=curr.next;
            }
            right--;
            for(int k=right;k>=left && curr!=null;k--){
                res[bottom][k]=curr.val;
                curr=curr.next;
            }
            bottom--;
            for(int l=bottom;l>=top && curr!=null;l--){
                res[l][left]=curr.val;
                curr=curr.next;
            }
            left++;
        }
        return res;
    }
}