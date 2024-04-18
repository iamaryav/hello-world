/**
 * Rotate Matrix 
 * 
 * n * n matrix - square matrix
 * 
 * Rotate matrix by 90 degress in counter clock wise 
 * in place
 * original matrix:
 * 1, 2, 3
 * 4, 5, 6
 * 7, 8, 9
 * 
 *First step: 
 * Transpose the matrix:
 * 1, 4, 7
 * 2, 5, 8
 * 3, 6, 9 
 * 
 * Second step:
 * 90 degree rotation in clockwise direction matrix:
 * 7, 4, 1
 * 8, 5, 2
 * 9, 6, 3 
 * 
 * Counter clock wise rotation:
 * 3, 6, 9
 * 2, 5, 8
 * 1, 4, 7 
 * 
 * Algorithms:
 * Loop through matrix and transpose the matrix
 * 
 * Loop through the matrix and swap the row for clockwise 
 * 
 *Time complexity:
 * O(n^2) 
 * 
 * Space complexity:
 * O(n)
 * 
 * 
 */



public class RotateMatrix{
    public static void main(String[] args){

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++) {
            int temp 
           }
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
           }
            System.out.println();
        }


    }
}