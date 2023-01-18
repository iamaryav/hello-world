import java.util.Scanner;

/**
 * input - sorted array
 * search and split
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[] { 7, 9, 11, 18, 21, 26, 32, 60, 90 };
        int lb = 0;
        int ub = numbers.length - 1;
        int mid = (lb + ub) / 2;
        System.out.print("Enter the value for search: ");
        int val = sc.nextInt();

        //int index = binarySearchRec(numbers, val, lb, ub);

        int index = binarySearch(numbers, val, lb, ub);

        if (index >= 0) {
            System.out.println("Value found on position: "+ index);
        } else {
            System.out.println("Value not found");
        }        
    }

    /**
     * O(logn)
     * @param numbers
     * @param val
     * @param lb
     * @param ub
     * @return
     */
    public static int binarySearchRec(int[] numbers, int val, int lb, int ub){    
        int mid = (lb + ub) / 2;
        if(numbers[mid] == val){
            return mid+1;
        }
        if(lb <= ub){
            if(val < numbers[mid]){
                return binarySearch(numbers, val, lb, mid-1);
            }else{
                return binarySearch(numbers, val, mid+1, ub);
            }
        }
        return -1;
    }
    /**
     * O(logn)
     * @param numbers
     * @param val
     * @param lb
     * @param ub
     * @return
     */

    public static int binarySearch(int[] numbers, int val, int lb, int ub){

        int mid = (lb + ub) / 2;

        while(lb <= ub && val != numbers[mid] ){
            if(val < numbers[mid]){
                ub = mid - 1;
            }else{
                lb = mid + 1;
            }

            mid = (lb + ub) / 2;
        }      
        if(val == numbers[mid]){
            return mid + 1;
        } 
        return -1;
    }
}
