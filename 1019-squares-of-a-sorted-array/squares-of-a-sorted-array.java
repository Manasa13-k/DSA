class Solution {
    public int[] sortedSquares(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                res[i]=arr[l]*arr[l];
                l++;
            }else{
                res[i]=arr[r]*arr[r];
                r--;
            }
        }
        return res;      
    }
}