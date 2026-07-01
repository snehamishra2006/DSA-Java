class Solution {
    public int maxSubarraySumCircular(int[] arr) {
         int currMax = 0;
         int maxSum = Integer.MIN_VALUE;
         int currMin = 0;
         int minSum = Integer.MAX_VALUE;
         int totalSum =0;

         for(int i=0; i<arr.length; i++){
            // finding total sum
            totalSum+=arr[i];
            // find max subarr Sum
            currMax+=arr[i];
            maxSum = Math.max(currMax,maxSum);
            if(currMax<0) currMax=0;

            // find min subarr Sum
            currMin+=arr[i];
            minSum = Math.min(currMin,minSum);
            if(currMin>0) currMin=0;
         }
         if(maxSum<0) return maxSum;
         // for circular array
         return Math.max(maxSum,totalSum-minSum);
                         
    }
}





