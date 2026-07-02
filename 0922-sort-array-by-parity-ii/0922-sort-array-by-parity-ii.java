class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int even =0;
        int odd =1;
        for(int elem:nums){
            if(elem%2==0){
                ans[even] = elem;
                even+=2;
            }
            else{
                ans[odd] = elem;
                odd+=2;
            }
        }
       return ans;    
    }
}