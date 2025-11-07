package logics.Assignament5;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original matrix:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        int[][] transposed = transpose(arr);

        System.out.println("Transposed matrix:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] t = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
}
