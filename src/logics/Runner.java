package logics;

class SuperClass {
    public void doSomething() {
        System.out.println("SuperClass implementation");
    }
}

class SubClass extends SuperClass {
    @Override
    public void doSomething() {
        System.out.println("SubClass implementation");
    }
}

public class Runner {
    public static void main(String[] args) {
        SuperClass ref = new SubClass();

        ref.doSomething(); // prints: “SubClass implementation”

    }
}
