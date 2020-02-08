/**
 * Binary search algorithm
 * Mentorship program's topic: Data Structures and Algorithms in Java
 *
 * @author Oleksandr Deineka
 * @version 1.0
 * @since 2020-02-08
 */
public class BinarySearch {

    public int doBinarySearch(int[] array, int zeroValue, int tempArrayLength, int searchTarget) {
        if (tempArrayLength >= zeroValue) {
            int mid = zeroValue + (tempArrayLength - zeroValue) / 2;
            if (array[mid] == searchTarget)
                return mid;
            if (array[mid] > searchTarget)
                return doBinarySearch(array, zeroValue, mid - 1, searchTarget);
            return doBinarySearch(array, mid + 1, tempArrayLength, searchTarget);
        }
        return -1;
    }
}
