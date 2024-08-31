class Solution
{
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        // code here
        for(int i = n - 1; i >= 0; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
