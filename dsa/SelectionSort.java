import java.util.*;

public class SelectionSort{

    public static void selectionSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int minIndex = i;
            for(int j = i; j < nums.length; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    
    
    
    
    public static void main(String[] args){
        int[] nums = {9, 3, 4, 6, 1, 2, 5};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}