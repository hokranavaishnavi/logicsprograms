package logics.practice;

//Input:
//String[] names = {"apple", "banana", "cherry", "date"};
//Output:
//String[] shortNames = {"app", "ban", "che", "dat"};

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String[] arr={"apple","banana","cherry","date"};
        String[] s=new String[4];
        for(int i=0; i<arr.length; i++){

            s[i]=arr[i].substring(0,3);

        }

            System.out.println(Arrays.toString(s));



    }
}
