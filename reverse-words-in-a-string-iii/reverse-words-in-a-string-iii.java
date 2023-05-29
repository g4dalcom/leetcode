class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = 0;
        
        while (left < ch.length) {
            while (left < right || left < ch.length && ch[left] == ' ') left++;
            while (right < left || right < ch.length && ch[right] != ' ') right++;
            
            reverse(left, right-1, ch);
        }
        
        return String.valueOf(ch);
    }
    
    public void reverse(int start, int end, char[] ch) {
        while (start < end) {
            char temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
    }
}