class Solution {
    public String addBinary(String a, String b) {
        Stack<Integer> stack = new Stack<>();
        
        int ap = a.length()-1;
        int bp = b.length()-1;
        
        int ceil = 0;
        while(true) {
            if (ap < 0) {
                while (bp >= 0) {
                    int cal = b.charAt(bp) - '0' + ceil;
                    stack.push(cal % 2);
                    ceil = cal >= 2 ? 1 : 0;
                    bp--;
                }
                if (ceil == 1) stack.push(ceil);
                break;
            } else if (bp < 0) {
                while (ap >= 0) {
                    int cal = a.charAt(ap) - '0' + ceil;
                    stack.push(cal % 2);
                    ceil = cal >= 2 ? 1 : 0;
                    ap--;
                }
                if (ceil == 1) stack.push(ceil);
                break;
            }
            
            int ia = a.charAt(ap) - '0';
            int ib = b.charAt(bp) - '0';
            
            int cal = ia + ib + ceil;
            
            if (cal >= 2) {
                stack.push(cal % 2);
                ceil = 1;
            } else {
                stack.push(cal);
                ceil = 0;
            }
            
            ap--;
            bp--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}