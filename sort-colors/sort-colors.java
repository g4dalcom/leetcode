class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int base = i;
            
            for (int j = i+1; j < nums.length; j++) {
                if (nums[base] > nums[j]) base = j;    
            }
            
            int temp = nums[i];
            nums[i] = nums[base];
            nums[base] = temp;
        }
    }
}