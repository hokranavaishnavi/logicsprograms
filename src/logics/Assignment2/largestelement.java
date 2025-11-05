package logics.Assignment2;

public class largestelement {
    //Java Program to Print the Largest Element in an Integer Array without Using a Sorting Algorithm

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,10,9,6,3};
            int large=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>large){
                    large=arr[i];
                }

            }
            System.out.println(large);
        }

    }

