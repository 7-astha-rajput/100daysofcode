class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to a character array and initialize pointers
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                right--;
            }
            // Compare characters, ignoring case
            if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true; // All characters matched, it is a palindrome
    }
}
