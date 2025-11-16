package logics.practice;

public class SampleTry {
    public static void main(String[] args) {
        int[] intArr = {1,2,3};
        display(intArr);


    }

    static void display(int[] xArr){
        System.out.println(xArr[0]);
        xArr[0]=9;
        System.out.println(xArr);

    }
}