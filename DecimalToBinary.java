public class DecimalToBinary {

    // Recursive function to convert decimal to binary
    public static String decimalToBinary(int n) {
        // Base case: if n is 0, return an empty string
        if (n == 0) {
            return "";
        }
        // Recursive case: get binary of (n / 2) and append remainder
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int number = 10; // Example input
        String binary = decimalToBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binary);
    }
}
