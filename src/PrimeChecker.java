package src;

/**
 * Utility class for prime number validation problems.
 */
public class PrimeChecker {

    /**
     * Determines whether a given number is prime.
     *
     * @param number the number to evaluate
     * @return true if the number is prime; false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    private static void printResult(int number) {
        if (number <= 1) {
            System.out.println("Input must be greater than 1.");
            return;
        }

        System.out.println(
                number + " is prime? " + isPrime(number)
        );
    }

    public static void main(String[] args) {
        final int testNumber = 29;
        printResult(testNumber);
    }
}
