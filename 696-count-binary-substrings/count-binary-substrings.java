class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0;
        int previouscount = 0;
        int currcount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currcount++;
            } else {
                res += Math.min(previouscount, currcount);
                previouscount = currcount;
                currcount = 1;
            }
        }
        return res + Math.min(previouscount, currcount);
    }
}