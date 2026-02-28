class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                res += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (set.size() > 0) {
            res += 1;
        }
        return res;
    }
}