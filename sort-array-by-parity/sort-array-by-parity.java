class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        
        while (true) {
            while (lo + 1 < nums.length && nums[lo] % 2 == 0) {
                lo++;
            }
            
            while (hi - 1 >= 0 && nums[hi] % 2 == 1) {
                hi--;
            }
            
            if (lo >= hi) break;
            
            int tmp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = tmp;
        }
        
        return nums;
    }
}
