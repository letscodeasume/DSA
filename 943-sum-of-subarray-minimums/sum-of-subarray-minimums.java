class Solution {
    private int[] NSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            res[i]=!st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return res;
    }

    private int[] PSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
           res[i]=!st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return res;
    }

    public int sumSubarrayMins(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int mod = (int) 1e9 + 7;
        int[] fnse = NSE(arr);
        int[] fpse = PSE(arr);
        for (int i = 0; i < n; i++) {
            int left = i - fpse[i];
            int right = fnse[i] - i;
            long freq = left * right * 1L;
            int val = (int) ((freq * arr[i]) % mod);
            sum = (sum + val) % mod;

        }

        return sum;
    }
}