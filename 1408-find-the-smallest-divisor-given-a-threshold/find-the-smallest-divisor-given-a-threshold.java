class Solution {
    public static boolean isPossible(int arr[],int target,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int val=arr[i];
            int temp=val/k;
            if(val%k!=0){
                temp++;
            }
            target-=temp;
            if(target<0){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=1000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,threshold,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}