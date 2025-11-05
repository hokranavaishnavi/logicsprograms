package logics.Assignment1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates {

        //-------------------using collections-------------------
    /*public static void main(String[] args) {
        int[] arr={1,2,3,1,3,4,5,5,6};
        System.out.println(Arrays.toString(arr));

        Set<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);
    }*/

        //------------------without using collections----------------
        public static void main(String[] args) {
            int[] arr = {1,1,2,3,2,3,3,4,5,5,6,4};
            int n = arr.length;
            boolean[] visited = new boolean[n];
            System.out.println(Arrays.toString(arr));

            for (int i = 0; i < n; i++) {
                if (visited[i])
                    continue;

                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                    }
                }
                System.out.print(arr[i]+" ");
            }
        }
    }

