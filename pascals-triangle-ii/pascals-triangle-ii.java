// class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         int[] pascal = new int[rowIndex+1];
        
//         for (int i = 0; i < rowIndex+1; i++) {
//             int prev = 1;
//             for (int j = 0; j < i+1; j++) {
//                 if (j == 0 || j == i) pascal[j] = 1;
//                 else {
//                     int temp = pascal[j];
//                     pascal[j] = prev + pascal[j];
//                     prev = temp;
//                 }
//             }
//         }
        
//         return Arrays.stream(pascal).boxed().collect(Collectors.toList());
//     }
// }

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            result.add(1);
            
            for (int j = i-1; j > 0; j--) {
                result.set(j, result.get(j-1) + result.get(j));
            }
        }
        
        return result;
    }
}
