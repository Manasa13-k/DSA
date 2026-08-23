class Solution {
    public static boolean isPossible(int arr[],int m,int k,int days){
        int take=0;
        int bouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                take++;
                if(take==k){
                    bouquets++;
                    take=0;
                }
            }else{
                take=0;
            }
        }
        return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }   
}