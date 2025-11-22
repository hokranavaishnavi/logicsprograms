package DSA.Assignment8;

    class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    class StackImp {
        Node head;
        int count = 0;

        // Add element to stack
        public void push(Object data) {
            if (head == null) {
                head = new Node(data, null);
                count++;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(data, null);
            count++;
        }

        // Size of the stack
        public int size() {
            return count;
        }

        // Display the stack elements
        public void display() {
            Node curr = head;
            if (curr == null) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Stack elements:");
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }
        }

        // Peek (Displays the last element in the stack)
        public Object peek() {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            return curr.data;
        }

        // Pop (Used to delete and display the deleted element)
        public Object pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return null;
            }

            Node curr = head;
            Node prev = null;

            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

            Object temp = curr.data;

            if (prev != null) {
                prev.next = null;
            } else {
                head = null;
            }

            count--;
            return temp;
        }

        // To check if stack is empty or not
        public boolean isEmpty() {
            return count == 0;
        }
    }

    public class StackUsingLinkedList {
        public static void main(String[] args) {
            StackImp s = new StackImp();
            s.push(10);
            s.push(20);
            s.push(30);

            s.display();
            System.out.println("Peek element: " + s.peek());

            s.pop();
            s.display();
        }
    }

