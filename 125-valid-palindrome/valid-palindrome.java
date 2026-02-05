class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                str.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                str.append(Character.toLowerCase(ch));
            }

        }
        return checkPalindrome(str.toString());
    }

    boolean checkPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)){
            return false;
            }
            l++;
            r--;
        
        }return true;
}}