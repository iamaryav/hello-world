package algoritms;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(32, 21, 11, 26, 9, 18, 7);
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int iterationCount = 0;
        // flag is used for if none of the swap happens in first iteration that means
        // list is sorted 
        // Modified Bubble sort
        int flag = 1;

        for (int i = 0 ; i < numbers.size() && flag == 1 ; i++){
            flag = 0;
            for(int j = 0 ; j < numbers.size()-i-1; j++){
                iterationCount = iterationCount + 1;
                if(numbers.get(j) > numbers.get(j+1)){
                    flag = 1;
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, temp);
                }
            }
        }
        System.out.println("Iteration count: " + iterationCount);
        System.out.println(numbers);
    }
    
}
