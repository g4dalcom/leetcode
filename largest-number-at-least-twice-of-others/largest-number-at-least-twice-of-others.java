class Solution {
    public int dominantIndex(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        
        int largest = clone[clone.length-1];
        for (int i = 0; i < clone.length-1; i++) {
            if (clone[i] * 2 > largest) return -1;
        }
        
        return Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(largest);
    }
}