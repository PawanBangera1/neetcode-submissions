class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);  //nlogn
        int count = 1;
        int Longest = 1;
        for(int i=1; i<nums.length;i++){   //n
            if( nums[i-1]+1 == nums[i]){
                count++;
            }
            else if( nums[i]==nums[i-1]){
                continue;
            }
            else{
                count=1;
            }
            Longest = Math.max(count, Longest);

        }
        return Longest;
    }
}
