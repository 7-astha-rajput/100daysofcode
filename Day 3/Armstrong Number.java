import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    // Method to calculate the sum of the cubes of the digits
    public static boolean isArmstrong(int x) {
        int sum = 0;
        int original = x;
        while (x > 0) {
            int ld = x % 10;
            sum = sum + (ld * ld * ld);
            x = x / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        // Read number of test cases
        int T = scanner.nextInt();
        // Iterate through all test cases
        for (int i = 0; i < T; i++) {
            // Read each number
            int x = scanner.nextInt();
            // Check if the number is an Armstrong number
            if (isArmstrong(x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
