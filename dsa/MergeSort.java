import java.util.*;

public class MergeSort{

    public static int[] mergeSort(int[] nums){

        if(nums.length == 1) return nums;

        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    
    }

    public static int[] merge(int[] nums1, int[] nums2){
        int[] combined = new int[nums1.length + nums2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                combined[index] = nums1[i];
                index += 1;
                i += 1;
            }else{
                combined[index] = nums2[j];
                index += 1;
                j += 1;
            }
        }
        while(i < nums1.length){
            combined[index] = nums1[i];
            index += 1;
            i += 1;
        }

        while(j < nums2.length){
            combined[index] = nums2[j];
            index += 1;
            j += 1;
        }
        return combined;
    }

    public static void main(String[] args){
        int[] nums = {9, 3, 4, 6, 1, 2, 5};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

}