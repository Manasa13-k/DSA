class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int area=Integer.MIN_VALUE;
        while(left<=right){
            int w=right-left;
            int h=Math.min(arr[right],arr[left]);
            area=Math.max(area,w*h);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}