package logics.Assignment1;

import java.util.Scanner;

public class frequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int count = 1;
                if(a[i] == -1) continue;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -1;
                    }

                }
                System.out.println(a[i] + " = " + count);
            }

        }
    }



        //Using Collections
       /*LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        map.forEach((key,value) -> {
            System.out.println(key+" "+value);
        });

    }
}*/

