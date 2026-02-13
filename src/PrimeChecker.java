package src;

/**
 * Utility class for solving prime number problems.
 */
public class PrimeChecker {

    /**
     * Checks if a number is prime.
     *
     * @param number the number to evaluate
     * @return true if prime, false otherwise
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

    public static void main(String[] args) {
        int testNumber = 29;
        System.out.println(testNumber + " is prime? " + isPrime(testNumber));
    }
}
