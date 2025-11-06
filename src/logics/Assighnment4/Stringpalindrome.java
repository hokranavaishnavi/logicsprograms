package logics.Assighnment4;

public class Stringpalindrome {
    public static void main(String[] args) {
        String str="aabba";
        str=str.toLowerCase();
        char[] ch=str.toCharArray();
        int i=0, j=ch.length-1;
        while(i<j) {
            if (ch[i] != ch[j]) {
                System.out.println("not a palindrome");
                return;
            }
            i++;
            j--;
        }

                System.out.println("palindrome");

        }
    }
