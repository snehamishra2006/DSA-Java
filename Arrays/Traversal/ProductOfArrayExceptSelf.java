class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length]; 
        int i=0;
        while(i<nums.length){
            int prod =1;
        for(int j=0; j<nums.length; j++){
            if(j!=i) prod *=nums[j];
        }
        ans[i] = prod;
        i++;
        }
        return ans;
    }
}
