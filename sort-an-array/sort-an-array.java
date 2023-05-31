class Solution {
    public int[] sortArray(int[] nums) {
        for (int i = (nums.length-1)/2; i >= 0; i--) {
            heapify(nums, i, nums.length);
        }
        
        for (int i = nums.length-1; i > 0; i--) {
            swap(nums, 0, i);
            heapify(nums, 0, i);
        }
        
        return nums;
    }
    
    public void heapify(int[] nums, int parentIdx, int size) {
        int left;
        int right;
        int largest;
        
        while ((parentIdx * 2) + 1 < size) {
            left = parentIdx * 2 + 1;
            right = parentIdx * 2 + 2;
            largest = parentIdx;
            
            if (nums[left] > nums[largest]) largest = left;
            
            if (right < size && nums[right] > nums[largest]) largest = right;
            
            if (largest != parentIdx) {
                int temp = nums[largest];
                nums[largest] = nums[parentIdx];
                nums[parentIdx] = temp;
                parentIdx = largest;
            } 
            else return;
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
