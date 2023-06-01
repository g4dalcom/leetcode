class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
        List<List<Integer>> result = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i-1];
            
            if (min >= diff) {
                if (min > diff) {
                    min = diff;
                    result.clear();
                }
                
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        
        return result;
    }
}