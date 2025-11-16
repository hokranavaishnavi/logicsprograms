package logics;

class A{
    public A display(){
        return null;
    }
}
class B extends A{
    public B display(){
        return null;
    }

}
public class sample {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.display());
    }
}

