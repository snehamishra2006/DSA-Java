class Solution {
    public int differenceOfSum(int[] nums) {
        int elemSum =0;
        int digitSum=0;
        for(int num: nums){
            elemSum+=num;
            while(num>0){
               digitSum+=num%10;
               num/=10;
            }
        }
        int difference = Math.abs(elemSum-digitSum);
        return difference;
    }
}