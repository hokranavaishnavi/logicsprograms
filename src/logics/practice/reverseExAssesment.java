package logics.practice;

public class reverseExAssesment {
    public static void main(String[] args) {
        String str1 = "My name is java";
        //String[] arr=str1.split(" ");
        String res = "";
        for (int i = str1.length() - 1; i >= 0; i--) {

            res = res + str1.charAt(i) ;
        }
        System.out.println(res );
    }
}

//    static String reverse(String str){
//        char[] ch=str.toCharArray();
//        int i=0, j=ch.length-1;
//        while(i<j){
//            char temp=ch[i];
//            ch[i]=ch[j];
//            ch[j]=temp;
//            i++;
//            j--;
//
//
//
//        }
//       //System.out.println(Arrays.toString(ch));
////        for(char c:ch){
////            System.out.print(c);
////        }
//        String s= new String(ch);
//        return s;
//    }
//
//}
