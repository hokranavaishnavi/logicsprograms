package logics.Assighnment4;

public class maxminoccur {
            public static void main(String[] args) {
                maxAndMin();

            }
            static void maxAndMin() {
                String str = "aabcccd";
                int[] arr = new int[26];
                for (int i = 0; i < str.length(); i++) {
                    arr[str.charAt(i) - 'a']++;
                }
                int maxIndex = 0;
                int minindex = 0;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < 26; i++) {
                    if (arr[i] > max && arr[i] != 0) {
                        maxIndex = i;
                        max = arr[i];

                    }
                    if (arr[i] < min && arr[i] != 0) {
                        minindex = i;
                        min = arr[i];
                    }
                }
                System.out.println("the max charactor is "+ (char)(maxIndex+'a')+"-> "+max);
                System.out.println("the min charactor is "+ (char)(minindex+'a')+"-> "+minindex);


    }
}
