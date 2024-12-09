   
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int slargest = -1;
        int n = arr.length;
        for(int i = 0; i< n ; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else
                if(arr[i]<largest && arr[i] > slargest)
                slargest = arr[i];
                
            
        }
        return slargest;
    }
}
