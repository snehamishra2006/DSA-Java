class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int currmax =0;
        int currmin =0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        // finding Maximum suum
        for(int i=0; i<n; i++){
            currmax = nums[i]+currmax;
            maxsum = Math.max(maxsum,currmax);
            if(currmax<0) currmax=0;
        // finding minimum sum
            currmin = nums[i]+currmin;
            minsum = Math.min(minsum,currmin);
            if(currmin>0) currmin=0;
        }

        return Math.max(maxsum,Math.abs(minsum));
    }
}