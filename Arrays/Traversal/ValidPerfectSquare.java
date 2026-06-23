class Solution {
    public boolean isPerfectSquare(int num) {
        // for(int i=0; i*i<=num; i++){
        //     if(i*i==num) return true;
        // }
        // return false;

        // Binary Search -- Optimal sol
        long lo = 1;
        long hi = num;
        while(lo<=hi){
            long mid = lo +(hi-lo)/2;
            long sqr = mid*mid;
            if(sqr==num) return true;
            else if(sqr<num) lo = mid+1;
            else hi = mid-1;
        }
        return false;
    }
}
