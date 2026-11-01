class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int l=0;
        int r=nums.length-1;
        while(mid<=r){
                if(nums[mid]==0){
                    int t=nums[mid];
                    nums[mid]=nums[l];
                    nums[l]=t;
                    mid++;
                    l++;
                }else if(nums[mid]==1){
                    mid++;
                }else{
                    int t=nums[mid];
                    nums[mid]=nums[r];
                    nums[r]=t;
                    r--;
                }
        }
    }
}