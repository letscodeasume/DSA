class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();

        for (char ch : num.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peekLast() > ch) {
                st.removeLast();
                k--;
            }

            st.addLast(ch);
        }

        // remove remaining k digits
        while (k > 0 && !st.isEmpty()) {
            st.removeLast();
            k--;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        for (char ch : st) {
            if (leadingZero && ch == '0')
                continue;
            leadingZero = false;
            sb.append(ch);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

}