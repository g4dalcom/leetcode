class Solution {
    public String reverseWords(String s) {
        String[] str = s.strip().split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (int i = str.length-1; i >= 0; i--) {
            if (!str[i].equals("")) {
                sb.append(str[i]);
                
                if (i != 0) sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}