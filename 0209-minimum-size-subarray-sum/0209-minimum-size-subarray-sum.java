class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int minLength=Integer.MAX_VALUE;
        int i=0; int j=0;

        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                sum=sum-nums[i];
                minLength = Math.min(minLength,j-i+1);
                i++;
            }
            j++;

        }
        if(minLength==Integer.MAX_VALUE) return 0;
         return minLength;
        
    }
}