class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos=0;
        int neg=1;
        for(int elem:nums){
            if(elem>0){  
                arr[pos] = elem;
                pos+=2;
            }
            else{
                arr[neg] = elem;
                neg+=2;
            }
        }
          return arr;
    }
}
