public class ZeroMatrix{
    public static void main(String[] args){

        int[][] matrix = {
            {1, 2, 3, 0},
            {4, 11, 5, 6},
            {7, 0, 9, 10}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Zero Matrix: ");

        int[][] zeroMatrix = covertToZeroMatrix(matrix, m, n);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(zeroMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] covertToZeroMatrix(int[][] matrix, int m, int n){

        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++){
            if(row[i]){
                makeRowZero(i, matrix);
            }
        }


        for(int i = 0; i < n; i++){
            if(column[i]){
                makeColumnZero(i, matrix);
            }
        }

        return matrix;

    }

    static void makeRowZero(int row, int[][] matrix){
        for(int i = 0; i < matrix[row].length; i++){
            matrix[row][i] = 0;
        }
    }

    static void makeColumnZero(int column, int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
    }
}