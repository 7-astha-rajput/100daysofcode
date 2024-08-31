class Solution
{
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Increment i while arr[i] is less than or equal to pivot
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            // Decrement j while arr[j] is greater than pivot
            while (arr[j] > pivot && j > low) {
                j--;
            }
            // Swap elements at i and j if they have not crossed
            if (i < j) {
                swap(arr, i, j); // Corrected: pass indices to swap method
            }
        }
        // Swap pivot with element at j
        swap(arr, low, j); // Corrected: pass indices to swap method
        return j;
    }

    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
