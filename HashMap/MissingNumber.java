class Solution {
    public int missingNumber(int[] nums) {
    //     if array has no missing element
    //     int n = nums.length;
    //     int sum = n*(n+1)/2;
    //    int arraySum =0;
    //    for(int ele: nums){
    //      arraySum +=ele;
    //    }
    //   return sum-arraySum;

    HashSet<Integer> set = new HashSet<>();
    for(int ele: nums){
        set.add(ele); 
    }
    for(int i=0; i<=nums.length; i++){
        if(!set.contains(i)) return i;
    }
    return -1;
    }
}
