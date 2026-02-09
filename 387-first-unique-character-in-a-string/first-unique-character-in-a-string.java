class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        Map<Character, Integer> charfreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freq = charfreq.getOrDefault(c, 0);
            charfreq.put(c, (freq + 1));
        }
        for (int i = 0; i < s.length(); i++) {
            if (charfreq.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;

    }
}