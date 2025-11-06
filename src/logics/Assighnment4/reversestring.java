package logics.Assighnment4;

public class reversestring {
    public static void main(String[] args) {
        String str = "I Love Programming";
        String[] str1 = str.split(" ");

        for (int i = 0; i < str1.length; i++) {
            reversestr(str1[i]);
        }
    }

    static void reversestr(String s1) {

//        String res="";
//        for (int i=s1.length()-1; i>=0; i--){
//            res=res+s1.charAt(i);
//
//        }
//        System.out.println(res);


        char[] ch=s1.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            i++;
            j--;
        }

        System.out.println(ch);


    }

}
