class Solution {
    public String removeDuplicateLetters(String s) {

        int n = s.length();
        StringBuilder res = new StringBuilder();

        boolean[] taken = new boolean[26];
        int[] lastind = new int[26];

        // store last index of each character
        for (int i = 0; i < n; i++) {
            lastind[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (taken[idx]) {
                continue;
            }

            while (res.length() > 0 &&
                    res.charAt(res.length() - 1) > ch &&
                    lastind[res.charAt(res.length() - 1) - 'a'] > i) {

                taken[res.charAt(res.length() - 1) - 'a'] = false;
                res.deleteCharAt(res.length() - 1);
            }

            res.append(ch);
            taken[idx] = true;
        }

        return res.toString();
    }
}