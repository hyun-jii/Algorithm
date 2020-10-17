class Solution {
    public String multiply(String num1, String num2) {
        int num1Length = num1.length();
        int num2Length = num2.length();
        int[] temp = new int[num1Length + num2Length];
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int length = temp.length;
        
        for(int i=num2Length-1; i>=0; i--) {
            int k = i;
            for(int j=num1Length-1; j>=0; j--) {
                int multiply = (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                multiply +=carry;

                if(j==0) {
                    temp[k] = multiply;
                    continue;
                }
                
                carry = multiply/10;
                temp[k] += multiply%10;
                k--;          
            }
        }

        for(int i=0; i<temp.length; i++) {
            if(i == temp.length-1 && temp[i] == 0) {
                break;
            }
            sb.append(temp[i]);
        }
        return sb.toString();
    }
}
