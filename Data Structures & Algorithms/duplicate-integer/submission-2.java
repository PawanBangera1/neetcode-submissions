class Solution {
    public boolean hasDuplicate(int[] nums) {
      int j=0;
      Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
          if(nums[j]==nums[i]){
            return true;
          }
          else j++;
        }
        return false;
    }
}