class Solution {
    public boolean isPossible(int arr[],int d,int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                return false;
            }
            sum+=arr[i];
            if(sum>k){
                d--;
                sum=arr[i];
            }
            if(d<=0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}