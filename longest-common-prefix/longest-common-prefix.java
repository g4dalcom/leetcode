class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    flag = false;
                    break;
                }

                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }

            }
            if (flag) sb.append(strs[0].charAt(i));
            else return sb.toString();
        }
        
        return sb.toString();
    }
}