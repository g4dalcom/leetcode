class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] check = new int[nums.length+1];
        
        for (int num : nums) {
            check[num]++;
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (check[i] == 0) result.add(i);
        }
        
        return result;
    }
}
