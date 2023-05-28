// <나의 풀이>
//
// class Solution {
//     public String reverseWords(String s) {
//         String[] str = s.strip().split(" ");
        
//         StringBuilder sb = new StringBuilder();
//         for (int i = str.length-1; i >= 0; i--) {
//             if (!str[i].equals("")) {
//                 sb.append(str[i]);
                
//                 if (i != 0) sb.append(" ");
//             }
//         }
//         return sb.toString();
//     }
// }


// <정규표현식을 이용한 더 간단한 풀이>
//
// class Solution {
//     public String reverseWords(String s) {
//         String[] str = s.strip().split(" +");
//         Collections.reverse(Arrays.asList(str));
        
//         return String.join(" ", str);
//     }
// }


// <투포인터 풀이>
//
class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int range = ch.length;
        
        reverse(0, range-1, ch);
        reverseWord(range, ch);
        return cleanBlank(range, ch);
    }
    
    public void reverse(int start, int end, char[] ch) {
        while (start < end) {
            char temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
    }
    
    public void reverseWord(int range, char[] ch) {
        int left = 0;
        int right = 0;
        
        while (left < range) {
            while (left < right || left < range && ch[left] == ' ') left++;
            while (right < left || right < range && ch[right] != ' ') right++;
            
            reverse(left, right-1, ch);
        }
    }
    
    public String cleanBlank(int range, char[] ch) {
        int pointer = 0;
        int idx = 0;
        
        while (pointer < range) {
            while (pointer < range && ch[pointer] == ' ') pointer++;
            while (pointer < range && ch[pointer] != ' ') ch[idx++] = ch[pointer++];
            while (pointer < range && ch[pointer] == ' ') pointer++;
            
            if (pointer < range) ch[idx++] = ' ';     
        }
        
        return new String(ch).substring(0, idx);
    }
}
