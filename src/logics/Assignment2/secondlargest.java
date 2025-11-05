package logics.Assignment2;

public class secondlargest {
    //Java Program to Print the 2nd Largest Element in an Integer Array without Using a Sorting Algorithm

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 10, 9, 6, 3};
            int large = 0;
            int seclarge = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > large) {
                    seclarge = large;
                    large = arr[i];
                } else if (arr[i]>seclarge) {
                    seclarge=arr[i];
                }
            }
            System.out.println(seclarge);
        }
    }
