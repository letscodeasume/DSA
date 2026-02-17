class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        // if (n > m) {
        //     return new ArrayList();
        // }
        List<Integer> res = new ArrayList();
        int[] refrence = new int[26];
        int[] slidewindow = new int[26];
        for (char c : p.toCharArray()) {
            refrence[c - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            slidewindow[s.charAt(i) - 'a']++;

            if (i >= n) {
                slidewindow[s.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(refrence, slidewindow)) {
                res.add(i - n + 1);
            }
        }

        return res;
    }
}

// for (int i = 1; i < m - n + 1; i++) {
//     slidewindow[s.charAt(i - 1) - 'a']--;
//     slidewindow[s.charAt(i + n - 1) - 'a']++;
//     if (Arrays.equals(refrence, slidewindow)) {
//         res.add(i);
//     }
// }
