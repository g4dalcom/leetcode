class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int cnt = 2;
        int cur = nums[nums.length-1];
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] < cur) {
                cur = nums[i];
                cnt--;
            }
            
            if (cnt == 0) return cur;
        }
        
        return nums[nums.length-1];
    }
}
