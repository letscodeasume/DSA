class Solution {
    public int strStr(String haystack, String needle) {
         int j=needle.length();
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            String substring=haystack.substring(i,i+needle.length());
            if (substring.equals(needle))return i;
            // i++;
            // j++;
        }
        return -1;
       
    }

   /*int n = haystack.length();
        for (int i = 0; i < n; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i) == true)
                    return i;

            }
        }

        return -1;
    public boolean compare(String haystack, String needle, int idx) {
        int n1 = needle.length();
        int n2 = haystack.length();
        for (int i = 0; i < n1; i++) {
            if (idx >= haystack.length()) {
                return false;
            }

            if (haystack.charAt(idx++) != needle.charAt(i)) {
                return false;
            }

        }
        return true;
    }*/
}