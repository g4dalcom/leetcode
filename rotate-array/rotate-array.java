class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k % nums.length;
        
        rotating(nums, 0, nums.length-1);
        rotating(nums, 0, rotate-1);
        rotating(nums, rotate, nums.length-1);
        
    }
    
    public void rotating(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
