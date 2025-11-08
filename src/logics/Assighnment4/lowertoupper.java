package logics.Assighnment4;

public class lowertoupper {
    public static void main(String[] args) {
        String str="VaIshu";
        String res="";
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(c>='A' && c <='Z'){
                res = res+(char) (c + ('a' - 'A'));
            } else if (c>='a' && c<='z') {
                res = res+ (char) (c - ('a' - 'A'));
            }
            else {
                 res = res+c;
            }
        }
        System.out.println(res);

    }
}
