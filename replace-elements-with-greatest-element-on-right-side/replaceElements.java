class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int cur = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (cur < arr[j]) {
                    arr[i] = arr[j];
                    cur = arr[j];
                }
            }
        }
        arr[arr.length-1] = -1;
        
        return arr;
    }
