
class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 0; i<= n-1; i++){
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
              int temp = arr[j-1];
              arr[j-1] = arr[j];
              arr[j] = temp;
              
              
              j--;
          }
      }
  }
}
