package algoritms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search: ");
        int value = sc.nextInt();
        List<Integer> numbers = Arrays.asList(32, 21, 11, 26, 9, 18, 7, 32);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == value){
                index = i+1;
                break;
            }
        }
        if(index > 0){
            System.out.println("Value "+ value + " is found on index " + index );
        }
        else{
            System.out.println("Value not found.");
        }
        
    }
    
}
