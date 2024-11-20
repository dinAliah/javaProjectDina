public class twoDimentional {
    public static void main(String[] args) {
    //
        int [][] matrix = new int[3][4];

        matrix [0][0] = 1; matrix [0][1] = 2; matrix[0][2] = 3; matrix[0][3] = 4;
        matrix [1][0] = 5; matrix [1][1] = 6; matrix [1][2] = 7; matrix[1][3] =8;
        matrix [2][0] = 9; matrix [2][1] = 10; matrix [2][2] = 11; matrix[2][3] = 12;


       int [][] matrix2 = {
            {8, 5, 4},
            {3, 2, 1},
            {10, 11, 12}

       };

        for (int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix.length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }

        
        for (int matrixrow[] : matrix2){
            for(int matrixcol : matrixrow){
                System.out.print(matrixrow + " ");
            }
            System.out.println();

        }

        //enhance for loop can gic=ve the same output
        //for (in matrixRow[] : matrix2){

        }
    }
    

