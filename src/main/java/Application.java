/**
 * The application is an executable point
 * Mentorship program's topic: Data Structures and Algorithms in Java
 *
 * @author Oleksandr Deineka
 * @version 1.0
 * @since 2020-02-08
 */
public class Application {
    private static final int[] unsortedArray = {8, 5, 2, 9, 5, 6, 3, 12, 25, 15};
    private static final int[] sortedArray = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
    private static SortTypes sortTypes = new SortTypes();
    private static FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
    private static BinarySearch binarySearch = new BinarySearch();

    public static void main(String[] args) {
        printResult(sortTypes.doBubbleSort(unsortedArray));
        printResult(sortTypes.doInsertionSort(unsortedArray));
        printResult(sortTypes.doSelectionSort(unsortedArray));
        System.out.println("Fibonacci: \n" + fibonacciRecursion.doFibonacciRecursively(5));
        System.out.println("Binary search: \n" + binarySearch.doBinarySearch(sortedArray, 0,
                sortedArray.length - 1, 45));
    }

    public static void printResult(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }
}
