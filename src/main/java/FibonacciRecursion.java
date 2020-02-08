/**
 * Fibonacci algorithm through the recursion
 * Mentorship program's topic: Data Structures and Algorithms in Java
 *
 * @author Oleksandr Deineka
 * @version 1.0
 * @since 2020-02-08
 */
public class FibonacciRecursion {

    public int doFibonacciRecursively(int n) {
        if (n <= 1)
            return n;
        return doFibonacciRecursively(n - 1) + doFibonacciRecursively(n - 2);
    }
}
