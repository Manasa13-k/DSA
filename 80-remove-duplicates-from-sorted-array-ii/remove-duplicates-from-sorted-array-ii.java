class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(i<2||nums[i]!=nums[l-2]){
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}