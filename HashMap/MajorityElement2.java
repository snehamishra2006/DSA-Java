class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele: map.keySet()){
            if(map.get(ele)>nums.length/3) ans.add(ele);
        }
        return ans;
    }
}
