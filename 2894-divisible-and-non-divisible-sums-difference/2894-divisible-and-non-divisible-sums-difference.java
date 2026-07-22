class Solution {
    public int differenceOfSums(int n, int m) {
        int divisibleSum=0;
        int NonDivisibleSum=0;
        for(int i=1; i<=n; i++){
            if(i%m!=0) NonDivisibleSum+=i;
            if(i%m==0) divisibleSum+=i;
        }
        return NonDivisibleSum-divisibleSum;
    }
}