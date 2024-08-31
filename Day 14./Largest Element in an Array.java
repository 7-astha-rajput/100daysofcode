class Solution {
    public static int largest(int[] arr) {
        // code here
        int large = arr[0];
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if (arr[i]> large){
                 large = arr[i];
            }
             
        }
        return large;
    }
}
