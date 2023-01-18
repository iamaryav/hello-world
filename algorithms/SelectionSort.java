package algoritms;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args){
        int[] numbers = new int[]{32, 21, 11, 26, 9, 18, 7};
        int size = numbers.length;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();
        // int[] numbers = new int[size];

        // for(int i = 0; i < size; i++){
        //     System.out.print("Enter the value: ");
        //     numbers[i] = sc.nextInt();
        // }

        for(int j = 0; j < size; j++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int k = j; k < size; k++){
                if(min > numbers[k]){
                    min = numbers[k];
                    index = k;
                }
            }
            int temp = numbers[j];
            numbers[j] = numbers[index];
            numbers[index] = temp;
        }
        for(int l = 0;  l < size; l ++){
            System.out.print(numbers[l]+" ");
        }
    }  
}
