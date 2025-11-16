package logics.practice;

public class passbyvalue {
    static int n=60;
    static void update(int n){
        n=n+10;
       // return n;
    }

    public static void main(String[] args) {
        //System.out.println(update(n));
        update(10);
        System.out.println(n);
    }

}
