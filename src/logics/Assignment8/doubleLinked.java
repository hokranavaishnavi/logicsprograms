package logics.Assignment8;


    class Node1
    {
        Node1 pre;
        int value;
        Node1 next;
    }

public class doubleLinked {
    Node1 head, tail;
    int size;

    void creation(int value) {
        head = new Node1();
        Node1 node = new Node1();
        node.next = null;
        node.pre = head;
        node.value = value;
        head = tail = node;
        size = 1;
        System.out.println(head);
    }
}
