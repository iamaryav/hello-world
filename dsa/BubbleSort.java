import java.util.*;


public class BubbleSort{
    
    public static void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {9, 3, 4, 6, 1, 2, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}