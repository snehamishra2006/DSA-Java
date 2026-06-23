class Solution {
    public int mySqrt(int x) {
    //     int ans =0;
    //    for(long i=1; i*i<=x; i++){
    //     if(i*i<=x) ans =(int)i;
    //    }

    //    return ans;

// optimal sol
    long lo=0;
    long hi=x;
    int ans =0;
    while(lo<=hi){
        long mid = lo+(hi-lo)/2;
        if(mid*mid<=x){
            ans = (int)mid;
            lo = mid+1;
        }
        else hi = mid-1;
    }
    return ans;
    }
}

    
