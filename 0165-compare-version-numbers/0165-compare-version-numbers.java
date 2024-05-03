class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr=version1.split("\\.");
        String[] arr1=version2.split("\\.");
        int longest=Math.max(arr.length,arr1.length);
        for(int i=0;i<longest;i++){
            int ver1=i<arr.length?Integer.parseInt(arr[i]):0;
            int ver2=i<arr1.length?Integer.parseInt(arr1[i]):0;
            if(ver1>ver2){
                return 1;
            }
            if(ver2>ver1){
                return -1;
            }
        }
        return 0;
    }
}