import java.util.Scanner;

public class MatrixHelper {
    public int[][] readMatrix()
    {
        Scanner in = null;
        //int matrix[][];
        try{
            in = new Scanner(System.in);
            System.out.println("Enter Rows");
            int row = in.nextInt();
            System.out.println("Enter Columns");
            int column = in.nextInt();

            int matrix[][] = new int[row][column];
            System.out.println("Enter the elements of the matrix");
            for(int i=0; i<row; i++)
                for (int j=0; j<column; j++)
                {
                    matrix[i][j] = in.nextInt();
                }
            return matrix;
        }catch(Exception e)
        {

        }
        return null;
    }

    public int[][] multiplyMatrix(int matrix_a[][], int matrix_b[][])
    {
        int[][] result = new int[matrix_a.length][matrix_b[0].length];
        for(int i=0; i<matrix_a.length; i++)
        {
            int sum =0;
            for(int j=0;j<matrix_b[i].length;j++)
            {
                sum+=(matrix_a[i][j]+matrix_b[j][i]);
            }

            for(int j=0; j<matrix_b[0].length;j++)
            {
                result[i][j] = sum;
            }
        }
        return result;
    }
}
