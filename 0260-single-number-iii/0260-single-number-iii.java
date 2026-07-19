class Solution {
    public int[] singleNumber(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
         ArrayList<Integer> ans = new ArrayList<>();
        for(int elem:nums){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        for(int elem: nums){
            if(map.get(elem)==1) ans.add(elem);
        }
           return new int[]{ans.get(0), ans.get(1)};
    }
}