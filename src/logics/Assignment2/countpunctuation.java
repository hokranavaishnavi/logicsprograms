package logics.Assignment2;

public class countpunctuation {

        public static void main(String[] args) {
            String str = "Hello, how are you? I'm fine! Thanks.";

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '!' || ch == ',' || ch == ';' || ch == '.' ||
                        ch == '?' || ch == '-' || ch == '\'' || ch == '\"' || ch == ':') {
                    count++;
                }
            }

            System.out.println("Total number of punctuations: " + count);
        }
    }