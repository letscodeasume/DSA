class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            int i = n1 >= 0 ? num1.charAt(n1) - '0' : 0;
            int j = n2 >= 0 ? num2.charAt(n2) - '0' : 0;
            int sum = i + j + carry;
            res.append(sum % 10);
            carry = sum / 10;
            n1--;
            n2--;
        }

        return res.reverse().toString();
    }
}