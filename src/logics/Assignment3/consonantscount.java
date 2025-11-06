package logics.Assignment3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class consonantscount {

        public static void main(String[] args) {
//            String str=new String("Hello java");
//            str=str.toLowerCase();
//            int count=0;
//
//            for(int i=0;i<str.length();i++) {
//                char ch = str.charAt(i);
//
//                if (ch >= 'a' && ch <= 'z') {
//                    if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
//                        count++;
//                    }
//                }
//            }
//            System.out.println("Total Consonants"+count);

            String str="Hello how are you";
            str=str.replace(" +","");
            Pattern p=Pattern.compile("[^aeiouAEIOU]");
            Matcher m=p.matcher(str);
            int count=0;
            while(m.find()){
                System.out.println(m.group()+" ");
                count++;
            }
            System.out.println(count);
        }
    }