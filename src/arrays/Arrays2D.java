package arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][4]; // here 3 is rows and 4 is column
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(matrix.length);

        System.out.println(matrix[1][3]);

        System.out.println("Matrix: ");
        for(int i=0; i< matrix.length; i++)
        {
            for(int j =0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
