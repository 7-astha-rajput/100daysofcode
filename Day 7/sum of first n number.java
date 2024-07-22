class Solution {
    long sumOfSeries(long n) {
        // code here
    long sum = 0;
    for (long i = 1;i<=n;i++){
        sum = sum + (i*i*i);
        
    }
    return sum;
    }
}
