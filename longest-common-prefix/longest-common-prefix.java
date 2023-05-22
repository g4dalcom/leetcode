// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < strs[0].length(); i++) {
//             boolean flag = true;
//             for (int j = 0; j < strs.length; j++) {
//                 if (i >= strs[j].length()) {
//                     flag = false;
//                     break;
//                 }

//                 if (strs[0].charAt(i) != strs[j].charAt(i)) {
//                     flag = false;
//                     break;
//                 }

//             }
//             if (flag) sb.append(strs[0].charAt(i));
//             else return sb.toString();
//         }
        
//         return sb.toString();
//     }
// }

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) != s2.charAt(idx)) break;
            idx++;
        }
        
        return s1.substring(0, idx);
    }
}