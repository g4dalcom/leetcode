class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < 0 && arr[i] % 2 == 0) {
                    if (arr[i] / 2 == arr[j]) return true;
                } else if (arr[i] >= 0) {
                    if (arr[i] * 2 == arr[j]) return true;
                }
            }
        }
        return false;
    }
}