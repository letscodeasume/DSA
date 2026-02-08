class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freqArr[] = new int[101];
        int sumfreq = 0;
        int maxfreq = 0;
        for (int element : nums) {
            freqArr[element]++;
            int currfreq = freqArr[element];
            if (currfreq > maxfreq) {
                maxfreq = currfreq;
                sumfreq = currfreq;

            } else if (currfreq == maxfreq) {
                sumfreq += currfreq;
            }
        }
        return sumfreq;
    }
}