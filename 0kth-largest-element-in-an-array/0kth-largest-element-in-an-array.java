// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int result = 0;
        
//         if (nums.length < 2) {
//             result = nums[0];
//             return result;
//         }
        
//         for (int i = nums.length/2 -1; i >= 0; i--) {
//             heapify(nums, i, nums.length);
//         }
        
        
//         for (int i = nums.length-1; i >= 0; i--) {
//             if (--k == 0) {
//                 result = nums[0];
//                 break;
//             }
//             swap(nums, 0, i);
//             heapify(nums, 0, i);
//         }
        
//         return result;
//     }
    
//     public void heapify(int[] nums, int parentIdx, int size) {
//         int left;
//         int right;
//         int largest;
        
//         while ((parentIdx * 2) + 1 < size) {
//             left = parentIdx * 2 + 1;
//             right = parentIdx * 2 + 2;
//             largest = parentIdx;
            
//             if (nums[left] > nums[largest]) largest = left;
//             if (right < size && nums[right] > nums[largest]) largest = right;
            
//             if (largest != parentIdx) {
//                 swap(nums, parentIdx, largest);
//                 parentIdx = largest;
//             }
//             else return;
//         }
//     }
    
//     public void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }


class Solution {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        int target = nums.length - k;
        
        while (start < end) {
            int pivot = partition(nums, start, end);
            if (pivot < target) start = pivot + 1;
            else if (pivot > target) end = pivot - 1;
            else return nums[pivot];
        }
        
        return nums[start];
    }
    
    public int partition(int[] nums, int start, int end) {
        int pivot = start;
        
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) start++;
            while (start <= end && nums[end] > nums[pivot]) end--;
            
            if (start <= end) {
                swap(nums, start, end);
            }
        }
        swap(nums, end, pivot);
        return end;
        
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}