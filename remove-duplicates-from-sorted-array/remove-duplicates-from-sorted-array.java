class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        
        for (int n : nums) {
            if (cnt == 0 || nums[cnt-1] < n) {
                nums[cnt++] = n;
            }
        }
        
        return cnt;
    }
}
