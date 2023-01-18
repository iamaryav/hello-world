package algoritms;

//chosse pivot element
//a <= pivot <= c
//
public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = new int[] { 32, 21, 90, 11, 60, 26, 9, 18, 7 };
        int lb = 0;
        int ub = numbers.length - 1;

        quickSort(numbers, lb, ub);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void quickSort(int[] numbers, int lb, int ub) {

        if (lb < ub) {
            int index = partition(numbers, lb, ub);
            quickSort(numbers, lb, index - 1);
            quickSort(numbers, index + 1, ub);

        }

    }

    public static int partition(int[] numbers, int lb, int ub) {
        int pivot = numbers[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (pivot >= numbers[start] && start < end) {
                start++;
            }
            while (pivot < numbers[end]) {
                end--;
            }
            if (start < end) {
                int temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;
            }
        }      
        numbers[lb] = numbers[end];
        numbers[end] = pivot;
        return end;
    }

}
