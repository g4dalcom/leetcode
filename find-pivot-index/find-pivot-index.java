class Solution {
    public int pivotIndex(int[] nums) {
        int Rsum = 0;
        for (int num : nums) Rsum += num;
        
        int Lsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Lsum * 2 == Rsum - nums[i]) return i;
            Lsum += nums[i];
        }
    
        return -1;
    }
}
