public class RecursiveSum {

    // Recursive function to find the sum of a positive integer
    public static int sumOfNumbers(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum current number and result of sumOfNumbers(n-1)
        return n + sumOfNumbers(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        int result = sumOfNumbers(number);
        System.out.println("Sum of numbers from 1 to " + number + " is: " + result);
    }
}
