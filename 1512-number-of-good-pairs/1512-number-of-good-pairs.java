// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count =0;
//          for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if( nums[i]==nums[j]) count++;
//             }
//          }
//         return count;
//     }
// }
 
//

class Solution {
    public int numIdenticalPairs(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int count =0;
    for(int elem:nums){
        count+=map.getOrDefault(elem,0);
        map.put(elem,map.getOrDefault(elem,0)+1);

    }
   
    return count;
    }
}