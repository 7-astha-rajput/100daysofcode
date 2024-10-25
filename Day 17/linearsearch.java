class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return true;
            }
            
        }
        return false;
    }
}
