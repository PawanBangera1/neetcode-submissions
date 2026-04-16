class Solution {
   public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    if (n == 0) return new int[0];
    
    int[] result = new int[n - k + 1]; // Correct size
    
    for (int i = 0; i <= n - k; i++) {
        int max = nums[i]; // Start max with the first element of the window
        for (int j = i; j < i + k; j++) {
            max = Math.max(max, nums[j]);
        }
        result[i] = max;
    }
    return result;
}
}
