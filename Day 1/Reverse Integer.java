class Solution {
    public int reverse(int x) {
        int revnum = 0;
        while(x!=0){
            int ld = x % 10;
          //check for overflow
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            revnum = (revnum * 10) + ld;
            x= x/10;
        }
        return revnum;
    }
    
}
