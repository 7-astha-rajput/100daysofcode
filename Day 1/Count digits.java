class Solution{
    static int evenlyDivides(int N){
        // code here
        int originalNumber = N;
        int count = 0;

        while (N > 0) {
            int ld = N % 10;
            N = N / 10;
            if (ld != 0 && originalNumber % ld == 0) {
                count++;
            }
        }
        return count;
    }
}
  
