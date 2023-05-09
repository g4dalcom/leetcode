class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(e -> (int) Math.pow(e, 2)).sorted().toArray();
        
    }
}