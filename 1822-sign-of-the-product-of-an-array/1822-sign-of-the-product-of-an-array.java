class Solution {
    public int arraySign(int[] nums) {
        // Dont pass all the test case for integer overflow and long will also overflow
    //     int prod=1;
    //     for(int elem: nums){
    //         prod*=elem;
    //     }
    //    return signFunc(prod);
    // }

    // public static int signFunc(int x){
    //     if(x>0) return 1;
    //     else if(x<0) return -1;
    //     else return 0;
    
    // optimal sol - taking a sign variable =1 if no less then 1 multiply by -1
    int sign=1;
    for(int num:nums){
       if(num==0) return 0;
       if(num<0) sign*=-1;
    }
    return sign;
    }
}