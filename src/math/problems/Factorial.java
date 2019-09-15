package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int num = 5;
        System.out.println("Iteration : Factorial of " + num + " = " + factorialIteration(num));
        System.out.println("Recursive : Factorial of " + num + " = " + factorialRecursive(num));

    }

    public static int factorialRecursive(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorialRecursive(n-1);
    }
    public static int factorialIteration(int n) {
        int result = 1;
        for (int r = 1; r <= n; r++) {
            result *= r;
        }
        return result;

    }
}
