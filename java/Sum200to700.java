public class Sum200to700 {
    public static void main(String[] args) {
        int sum = 0;

        // Iterate through numbers from 200 to 700
        for (int i = 200; i <= 700; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i; // Add the number to the sum
            }
        }

        // Print the sum
        System.out.println("Sum of numbers between 200 and 700 divisible by 3 and 5: " + sum);
    }
}
