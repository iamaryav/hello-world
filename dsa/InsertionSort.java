import java.util.*;

public class InsertionSort{
    
    public static void insertionSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i - 1;
            while(j > -1 && temp < nums[j]){
                nums[j+1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

    }
    
    
    
    
    
    
    
    public static void main(String[] args){
        int[] nums = {9, 3, 4, 6, 1, 2, 5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}