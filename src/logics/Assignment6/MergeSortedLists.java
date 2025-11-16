package logics.Assignment6;

public class MergeSortedLists {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node mergeSorted(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) tail.next = l1;
        else tail.next = l2;
        return dummy.next;
    }

    static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);

        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        System.out.println("List A:");
        printList(a);
        System.out.println("List B:");
        printList(b);

        Node merged = mergeSorted(a, b);
        System.out.println("Merged List:");
        printList(merged);
    }
}
