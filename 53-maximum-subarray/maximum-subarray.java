class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int curMax=arr[0];
        int maxSum=arr[0];
        for(int j=1;j<n;j++){
            curMax=Math.max(curMax+arr[j],arr[j]);
            maxSum=Math.max(curMax,maxSum);
        }
        return maxSum;
    }
}