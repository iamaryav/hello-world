/**
 * Rotate Matrix 
 * 
 * n * n matrix - square matrix
 * 
 * Algorithms:
 * 
 * matrix -> Transpose the matrix -> then change the row / column based on the direction
 * 
 *Time complexity:
 * O(n^2) 
 * 
 * Space complexity:
 * O(1)
 * 
 */

import java.util.*;

public class RotateMatrix{
    public static void main(String[] args){

        
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matrix: ");

        for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[i][j]+ " ");
           }
            System.out.println();
        }
        
        int n = matrix.length;

        for(int layer = 0; layer < n / 2; layer++){

            int first = layer; 
            int last = n - 1 - layer; 

            for(int j = first; j < last; j++){

                int offset = j - first; 
                int top = matrix[first][j]; 

                matrix[first][j] = matrix[last - offset][first];

                matrix[last - offset][first] = matrix[last][last - offset];

                matrix[last][last - offset] = matrix[j][last];

                matrix[j][last] = top;

            }

        }
        
        System.out.println("Rotated Matrix: ");

        for(int i = 0; i < n; i++){
           for(int j = 0; j <n; j++) {
            System.out.print(matrix[i][j] + " ");
           }
            System.out.println();
        }

    }
}