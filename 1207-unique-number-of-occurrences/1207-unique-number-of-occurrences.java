class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elem:arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int elem: map.keySet()){
            int freq = map.get(elem);
            if(set.contains(freq)) return false;
            set.add(freq);
        } 
        return true;
    }
}