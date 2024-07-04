import java.util.*;

public class QuickSort{

    public static void quickSortHelper(int[] nums, int left, int right){

        if(left < right){
            int pivotIndex = pivot(nums, left, right);
            quickSortHelper(nums, left, pivotIndex - 1);
            quickSortHelper(nums, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] nums){
        quickSortHelper(nums, 0, nums.length - 1);
    }

    public static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;

        for(int i = pivotIndex + 1; i <= endIndex; i++){
            if(array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }
    
    public static void main(String[] args){
        int[] nums = {9, 3, 4, 6, 1, 2, 5};
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}