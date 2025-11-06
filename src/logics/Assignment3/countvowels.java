package logics.Assignment3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countvowels {

        public static void main(String[] args) {
//            String str=new String("Hello java");
//            str=str.toLowerCase();
//            int count=0;
//
//            for(int i=0;i<str.length();i++){
//                char ch=str.charAt(i);
//
//                if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
//                    count++;
//                }
//            }
//            System.out.println("Total vowels "+count);


            String str="Hello how are you";
            Pattern p=Pattern.compile("[aeiouAEIOU]");
            Matcher m=p.matcher(str);
            int count=0;
            while(m.find()){
                System.out.println(m.group()+" ");
                count++;
            }
            System.out.println(count);
        }
    }