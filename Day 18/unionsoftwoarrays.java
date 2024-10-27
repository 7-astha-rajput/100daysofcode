class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int n = a.length;
        int m = b.length;
        HashMap<Integer, Integer> freq = new HashMap();
        ArrayList<Integer> Union = new ArrayList();
        for (int i = 0; i<n; i++){
            freq.put(a[i], freq.getOrDefault(a[i], 0) +1);
        }
        for(int i= 0; i< m; i++){
             freq.put(b[i], freq.getOrDefault(b[i], 0) +1);
        }
        for (int it : freq.keySet())
            Union.add(it);
            Collections.sort(Union);
                    return Union;



    }
}
