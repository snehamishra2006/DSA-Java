class Solution {
    public boolean isPowerOfFour(int n) {
        // if(n<=0) return false;
        // while(n%4==0){
        //     n= n/4;
        // }
        // return n==1;
        return (isPowerOfTwo(n) && issqrt(n));
    }
        // by bit manipulation
        public boolean isPowerOfTwo(int n){
            return n > 0 && (n&(n-1))==0;
        }

        public boolean issqrt(int n){
            long root = (long)(Math.sqrt(n));
            return root*root==n;
        }
}