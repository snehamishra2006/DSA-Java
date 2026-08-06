class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i =0;
       long maxSum =Integer.MIN_VALUE;
       int sum=0;
       int n  = nums.length;
       for(int j=0; j<nums.length; j++){
        if(k<=0) return 0;
             sum+=nums[j];
            if(j-i+1>k){
                sum= sum -nums[i];
                i++;
            } 
            if(j-i+1==k){
                maxSum = Math.max(maxSum,sum);
            }
       } 
       return (double)maxSum/k;
    }
}




// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int n = nums.length;
//         int sum =0;
//          // calculate sum of 1 window
//          for(int i=0; i<k; i++){
//              sum+=nums[i];
//          }
//          int maxSum = sum;
//          for(int i=k; i<n; i++){
//             sum = sum -nums[i-k] +nums[i];
//             maxSum = Math.max(maxSum,sum);
//          }
//          return (double)maxSum/k;
//     }
// }