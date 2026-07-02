class Solution {
    public int subarraySum(int[] nums, int k) {
        // Brute force
        // int count =0;
        // for(int i=0; i<nums.length; i++){
        //     int sum=0;
        //     for(int j=i; j<nums.length; j++){
        //         sum+=nums[i];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,1);
      int prefixSum=0;
      int count =0;
      for(int elem: nums){
        prefixSum+=elem;
        if(map.containsKey(prefixSum-k)){
           count+= map.get(prefixSum-k);
        }
        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
      }
       return count; 
    }
}