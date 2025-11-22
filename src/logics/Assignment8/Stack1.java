package logics.Assignment8;

public class Stack1 {

        static int[] arr;
        static int top;
    private static int size;
        public Stack1(int size){
            arr = new int[size];
            top = -1;
        }
    public static void main(String[] args) {

        System.out.println("hello");

        push(10);
        push(20);
        push(30);

        display();

        System.out.println("Top element = " + peek()); // 30

        System.out.println("Popped = " + pop());  // 30

        display();
        System.out.println("Is stack empty? " + isEmpty());
        System.out.println("Is stack full? " + isFull());
    }

        static boolean isEmpty () {
            return logics.Assignment8.Stack1.top == -1;
        }




    // Check if stack is full
    public static boolean isFull() {
        return top == size - 1;
    }

    // Push an element into stack
    public static void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed into stack");
    }

    // Pop/remove an element from stack
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }

        int value = arr[top]; // get top element
        arr[top] = 0;         // clear the removed slot
        top--;                // decrease stack pointer
        return value;                // return removed value
    }

    // Peek the top element without removing it
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty!");
            return -1;
        }
        return arr[top];
    }


    // Display all elements in stack
    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }






}


