class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum=0;
        int doubleSum=0;
        int totalSum=0;
        for(int i=0; i<nums.length; i++){
            totalSum+=nums[i];
            if(nums[i]>0 && nums[i]<=9){
                singleSum+=nums[i];
            }
            else if(nums[i]>=10 && nums[i]<=99){
                doubleSum+=nums[i];
            }
        }
        return (singleSum>totalSum-singleSum) || (doubleSum>totalSum-doubleSum);
    }
}