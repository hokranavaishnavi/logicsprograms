package logics.Assignment1;

public class print_duplicates {

        public static void main(String[] args) {
            int[] arr = {1,1,2,3,3,3,4,5,5,6,4,7};
            int n = arr.length;
            boolean[] visited = new boolean[n];

            System.out.println("Duplicate elements in the array:");

            for (int i = 0; i < n; i++) {
                if (visited[i]) continue;

                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }

                if (count > 1) {
                    System.out.println(arr[i]);  // print only duplicates
                }
            }
        }
    }




