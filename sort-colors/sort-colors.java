// 선택 정렬
//
// class Solution {
//     public void sortColors(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             int base = i;
            
//             for (int j = i+1; j < nums.length; j++) {
//                 if (nums[base] > nums[j]) base = j;    
//             }
            
//             int temp = nums[i];
//             nums[i] = nums[base];
//             nums[base] = temp;
//         }
//     }
// }



// 카운팅 정렬
//
class Solution {
    public void sortColors(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] counting = new int[max+1];
        int[] result = new int[nums.length];
        
        for (int num : nums) {
            counting[num]++;
        }
        
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }
        
        for (int i = nums.length-1; i >= 0; i--) {
            int value = nums[i];
            counting[value]--;
            result[counting[value]] = value;
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}