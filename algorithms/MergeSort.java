/**
 * find mid 
 * split on the basis of mid
 * then at merge but at the time of merge do sorting
 * total time complexity in each case O(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = new int[] { 32, 21, 90, 11, 60, 26, 9, 18, 7 };
        int lb = 0;
        int ub = numbers.length - 1;

        System.out.println("Unsorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSorted array: ");
        mergeSort(numbers, lb, ub);
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
    }

    public static void mergeSort(int[] numbers, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(numbers, lb, mid);
            mergeSort(numbers, mid + 1, ub);
            merge(numbers, lb, ub);
        }
    }

    public static void merge(int[] numbers, int lb, int ub) {
        int l = lb;
        int mid = (lb + ub) / 2;
        int m = mid + 1;
        int[] mergedArray = new int[25];
        int index = l;
        while (lb <= mid && m <= ub) {
            mergedArray[index++] = numbers[lb] <= numbers[m] ? numbers[lb++] : numbers[m++];
        }
        while (m <= ub) {
            mergedArray[index++] = numbers[m++];
        }
        while (lb <= mid) {
            mergedArray[index++] = numbers[lb++];
        }

        for (int j = l; j <= ub; j++) {
            numbers[j] = mergedArray[j];
        }
    }
}