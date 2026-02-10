class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            char tt = t.charAt(i);
            if ((mp.containsKey(cc) && mp.get(cc) != tt) || (!mp.containsKey(cc) && mp.values().contains(tt))) {
                return false;
            }
            mp.put(cc, tt);
        }
        return true;

    }
}