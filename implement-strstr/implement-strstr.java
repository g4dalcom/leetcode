// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// }


class Solution {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();
        
        for (int i = 0; i < hLength - nLength + 1; i++) {
            int cnt = 0;
            
            while (cnt < nLength) {
                if (haystack.charAt(i+cnt) == needle.charAt(cnt)) cnt++;
                else break;
            }
            
            if (cnt == nLength) return i;
        }
        
        return -1;
    }
}