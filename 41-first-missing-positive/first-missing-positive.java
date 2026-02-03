class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Data filtering
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] >= (n + 1)) {
                nums[i] = n + 1;
            }
        }
        //    marked visited
        for (int i = 0; i < n; i++) {
            int element = Math.abs(nums[i]);
            if (element == n + 1) {
                continue;
            }
            int seat = element - 1;
            if (nums[seat] > 0) {
                nums[seat] = -nums[seat];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

/*  By linear search O(n^2)
for(int i = 1;i<=nums.length+1;i++)
{
    // if i exsit in nums then return index if element otherwise return -1.
    int index = linearSearch(nums, i);
    if (index == -1) {
        return i;
    }
}return 1;
}

private int linearSearch(int []nums,int target){
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
    }
    return -1; */