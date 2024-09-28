class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        // Count how many times the array is "out of order"
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If the array is out of order more than once, return false
            if (count > 1) {
                return false;
            }
        }
        
        // If the array is out of order once or not at all, it can be a rotated sorted array
        return true;
    }
}

