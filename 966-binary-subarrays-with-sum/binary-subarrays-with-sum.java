class Solution {
    public int AtMostSum(int[] nums, int goal) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;
        while (end < n) {
            // expanding face
            sum += nums[end];
            while (start <= end && sum > goal) {
                sum -= nums[start];
                start++;
            }
            count += (end - start + 1);
            end++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return AtMostSum(nums, goal) - AtMostSum(nums, goal - 1);

    }
}
