class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        
        int cur1 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] > arr[cur1]) {
                cur1 = i+1;
            } else break;
        }
        
        int cur2 = arr.length-1;
        for (int i = arr.length-1; i >= 1; i--) {
            if (arr[i-1] > arr[cur2]) {
                cur2 = i-1;
            } else break;
        }
        
        if (cur1 == 0 || cur2 == arr.length-1) return false;
        
        return cur1 == cur2;
    }
}
