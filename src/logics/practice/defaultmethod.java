package logics.practice;

public class defaultmethod {
    public static void main(String[] args) {
        B b = new B();
    }
}
        class A{
            int m=1111;
            {
                m=m++;
                System.out.println(m);
            }

        }
        class B extends A{
            {
             System.out.println(methodOfY());
            }
            int methodOfY(){
                return  m-- + --m;
            }
        }

