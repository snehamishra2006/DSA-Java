class Solution {
    public int pivotIndex(int[] arr) {
      int n =arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1; i<n; i++){
            pref[i] =pref[i-1]+arr[i];
        }
        
        int suff[] = new int[n];
        suff[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = suff[i+1]+arr[i];
        }
        
        for (int i = 0; i < n; i++) {
        int leftSum = (i == 0) ? 0 : pref[i - 1];
        int rightSum = (i == n - 1) ? 0 : suff[i + 1];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}