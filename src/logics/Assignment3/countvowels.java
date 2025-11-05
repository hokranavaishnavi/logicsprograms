package logics.Assignment3;

public class countvowels {

        public static void main(String[] args) {
            String str=new String("Hello java");
            str=str.toLowerCase();
            int count=0;

            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);

                if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
            }
            System.out.println("Total vowels "+count);
        }
    }