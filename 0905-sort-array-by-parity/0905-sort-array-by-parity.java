class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int[] ans = new int[nums.length];
       int i=0;
       int j=ans.length-1;
       for(int elem: nums){
        if(elem%2==0){
           ans[i]=elem;
           i++;
        } 
        else{
            ans[j] = elem;
            j--;
        }
       }
       return ans;
    }
}