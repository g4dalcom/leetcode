class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int ap = a.length()-1;
        int bp = b.length()-1;
        
        int ceil = 0;
        
        while (ap >= 0 || bp >= 0) {
            int sum = ceil;
            if (ap >= 0) {
                sum += a.charAt(ap) - '0';
                ap--;
            }
            if (bp >= 0) {
                sum += b.charAt(bp) - '0';
                bp--;
            }
            
            sb.append(sum >= 2 ? sum % 2 : sum);
            ceil = sum / 2;
        }
        
        if (ceil != 0) sb.append(ceil);
        
        return sb.reverse().toString();
    }
}