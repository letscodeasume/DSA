class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack();
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                mp.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
        for (int i : st) {
            mp.put(i, -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = mp.get(nums1[i]);
        }

        return res;
    }
}