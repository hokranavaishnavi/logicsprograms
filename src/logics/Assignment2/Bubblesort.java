package logics.Assignment2;

public class Bubblesort {
    //Java Program to Sort Elements in an Array Using Bubble Sort

        public static void main(String[] args) {

            int arr[] = {1, 3, 5, 8, 4};

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.println("Array after Bubble Sort:");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }
    }