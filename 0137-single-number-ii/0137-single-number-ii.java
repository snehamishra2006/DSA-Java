class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elem: nums){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        for(int elem: nums){
            if(map.get(elem)==1) return elem;
        }
        return -1;
    }
}