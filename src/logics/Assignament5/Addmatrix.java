package logics.Assignament5;

import java.util.Arrays;

public class Addmatrix {
    public static void main(String[] args) {

        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{1,2},{3,4}};

        if(arr1.length != arr2.length || arr1[0].length != arr2[0].length){
            System.out.println("not a proper dimension");
        }

        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] arr3 = new int[rows][cols];



            for(int i=0; i<arr1.length; i++){
                for(int j=0; j< arr2.length; j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }
            }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }


//        private static void addMatrix() {
//            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//            int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//            int[][] arr3 = new int[3][3];
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    arr3[i][j] = arr[i][j] + arr2[i][j];
//                }
//            }
//            System.out.println(Arrays.deepToString(arr3));




    }
}
