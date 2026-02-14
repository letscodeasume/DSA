class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> freqmp = new HashMap<>();
        for (String s : strs) {
            String freqst = getfreqst(s);
            if (freqmp.containsKey(freqst)) {
                freqmp.get(freqst).add(s);
            } else {
                List<String> st = new ArrayList<>();
                st.add(s);
                freqmp.put(freqst, st);
            }
        }
        return new ArrayList<>(freqmp.values());
    }

    private String getfreqst(String st) {
        int[] freq = new int[26];
        for (char c : st.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder freqst = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {

            freqst.append(c);
            freqst.append(i);
            c++;
        }
        return freqst.toString();
    }
}