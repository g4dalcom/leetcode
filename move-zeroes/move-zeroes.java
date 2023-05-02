class Solution {
    public void moveZeroes(int[] nums) {
        int lo = 0;
        int hi = 0;
        
        if (nums.length == 1) return;
        
        while (true) {
            
           while (lo < nums.length && nums[lo] != 0) {
                lo++;
            }
            
            hi = lo;

            while (hi < nums.length && nums[hi] == 0) {
                hi++;
            }
            
            if (lo >= nums.length || hi >= nums.length) break;
            
            nums[lo] = nums[hi];
            nums[hi] = 0;
        }
    }
}