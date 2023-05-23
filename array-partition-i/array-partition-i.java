// class Solution {
//     public int arrayPairSum(int[] nums) {
//         Arrays.sort(nums);
        
//         int sum = 0;
//         for (int i = 0; i < nums.length; i+=2) {
//             sum += Math.min(nums[i], nums[i+1]);
//         }
        
//         return sum;
//     }
// }

class Solution {
    public int arrayPairSum(int[] nums) {
        int[] counting = new int[20001];
        
        for (int i = 0; i < nums.length; i++) {
            counting[nums[i] + 10000]++;
        }
        
        int sum = 0;
        boolean odd = true;
        for (int i = 0; i < counting.length; i++) {
            while (counting[i]-- > 0) {
                if (odd) {
                    sum += i - 10000;
                }
                
                odd = !odd;
            }
        }
        
        return sum;
    }
}