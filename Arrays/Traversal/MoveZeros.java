class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
      for(int i=0; i<n; i++){
        int swaps = 0;
        for(int j=0; j<n-1-i; j++){
            // push 0 towards right
            if(arr[j]==0 && arr[j+1]!=0){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaps++;
            }
        }
        if(swaps==0) break;
      }
    }
}
