class Solution {
    static int countDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            set.add(ele);
        }
        return set.size();
    }
}
