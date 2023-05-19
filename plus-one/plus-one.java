class Solution {
    public int[] plusOne(int[] digits) {
        int pointer = digits.length - 1;
        
        while (digits[pointer] == 9) {            
 
            if (pointer <= 0) {
                int[] newArr = new int[digits.length+1];
                newArr[0] = 1;
                
                for (int i = 1; i < newArr.length; i++) {
                    newArr[i] = digits[i-1];
                }
                newArr[pointer+1] = 0;
                return newArr;
            }            
            
            digits[pointer] = 0;
            pointer--;
        }
        
        digits[pointer]++;
        
        return digits;
    }
}