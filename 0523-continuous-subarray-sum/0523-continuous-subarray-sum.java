class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    //    // brutr force
    //     for(int i=0; i<nums.length;i++){
    //         int sum=0;
    //         for(int j=i; j<nums.length; j++){
    //             sum+=nums[j];
    //               if ((j - i+1) >= 2 && sum % k == 0)  return true;
    //         }
    //     }
    //   return false;

     // Optimal Solution
     HashMap<Integer,Integer> map = new HashMap<>();
     int prefix=0;
     map.put(0,-1);
     for(int i=0; i<nums.length; i++){
        prefix+=nums[i];
        int rem = prefix%k;
        if(map.containsKey(rem)){
            if(i-map.get(rem)>1 )return true;
        }
           else map.put(rem,i);
     }
return false;
    
       
    }
}