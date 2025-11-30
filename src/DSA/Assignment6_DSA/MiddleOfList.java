package DSA.Assignment6_DSA;

public class MiddleOfList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node findMiddle(Node head) {
        if (head == null) return null;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node middle = findMiddle(head);
        System.out.println("Middle element is: " + (middle != null ? middle.data : "None"));
    }
}

