package logics.Assignment2;

public class thirdlargest {
    //Java Program to Print the 3rd Largest Element in an Integer Array without Using a Sorting Algorithm

        public static void main(String[] args) {
            int[] arr = {1, 2,9, 3, 4, 5, 10, 6, 3};
            int flarge=0;
            int slarge=0;
            int tlarge=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]>flarge){
                    tlarge=slarge;
                    slarge=flarge;
                    flarge=arr[i];
                }
                else if (arr[i]>slarge) {
                    tlarge=slarge;
                    slarge=arr[i];
                }
                else if (arr[i]>tlarge) {
                    tlarge=arr[i];
                }
            }
            System.out.println(flarge+" "+slarge+" "+tlarge);
        }
    }

