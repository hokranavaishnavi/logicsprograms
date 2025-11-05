package logics.Assignment3;

public class divideparts {

        public static void main(String[] args) {
            String str = "ABCDEFGHIJKL";
            int n = 3; // divide into 3 parts

            int length = str.length();
            int size = length / n; // characters per part

            if(length % n != 0) {
                System.out.println("Cannot divide string equally!");
            } else {
                for(int i = 0; i < length; i += size) {
                    System.out.println(str.substring(i, i + size));
                }
            }
        }
    }