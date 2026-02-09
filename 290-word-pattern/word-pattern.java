class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mp = new HashMap<>();
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];
            if ((mp.containsKey(c) && !mp.get(c).equals(word)) || (!mp.containsKey(c) && mp.values().contains(word))) {
                return false;
            }
            mp.put(c, word);
        }
        return true;
    }
}