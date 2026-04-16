class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int l=0;
        int r=height.length-1;
        int count = 0;
        while(l<r){
            if(height[l]<=height[r]){
                lmax=Math.max(lmax,height[l]);
                count+=lmax-height[l];
                l++;
            }
            else{
                rmax=Math.max(rmax,height[r]);
                count+=rmax-height[r];
                r--;
            }
        }
        return count;

    }
}
