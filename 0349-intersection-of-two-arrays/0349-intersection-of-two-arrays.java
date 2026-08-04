class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        for(int elem: nums1){
            set.add(elem);
        }
        for(int elem: nums2){
            if(set.contains(elem)) common.add(elem);
        }
        // make result array of length common and convert it into array
        int result[] = new int[common.size()];
        int i=0;
        for(int elem: common){
           result[i] = elem;
           i++;
        }
        return result;
    }
}