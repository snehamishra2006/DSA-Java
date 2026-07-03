class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n = nums.length;
     int pref[] = new int[n];
     int suf[] = new int[n];
     int ans[] = new int[n];
     pref[0] = nums[0];
     for(int i=1;i<n; i++ ){
        pref[i]=pref[i-1]*nums[i];
     }
     
       suf[n-1] = nums[n-1];
     for(int i=n-2;i>=0; i-- ){
        suf[i]= suf[i+1]*nums[i];
     }

     for(int i=0; i<n; i++){
        int left = (i==0)?1:pref[i-1];
        int right = (i==n-1)?1:suf[i+1];
        ans[i] = left*right;
     }
     return ans;
    }
}


// Brutr force
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int ans[] = new int[nums.length]; 
//         int i=0;
//         while(i<nums.length){
//             int prod =1;
//         for(int j=0; j<nums.length; j++){
//             if(j!=i) prod *=nums[j];
//         }
//         ans[i] = prod;
//         i++;
//         }
//         return ans;
//     }
// }