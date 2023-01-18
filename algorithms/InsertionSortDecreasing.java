package algoritms;

import java.util.Arrays;
import java.util.List;

public class InsertionSortDecreasing {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(32, 21, 11, 26, 9, 18, 7);

        for(int i = 1; i < numbers.size(); i++){
            int key = numbers.get(i);
            int j = i - 1;
            while(j >= 0 && key > numbers.get(j)){
                numbers.set(j + 1, numbers.get(j));
                j = j - 1;
            }
            numbers.set(j+1, key);
        }
        System.out.println(numbers);
    }
    
}
