package DSA.Assignment6_DSA;

public class SingleLL {

        static class Node {
            int data;
            Node next;
            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Reverse the list and return new head
        static Node reverse(Node head) {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }

        // Find the middle node (if even length, returns the second of the two middles)
        static Node findMiddle(Node head) {
            if (head == null) return null;
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // Detect if there is a cycle (loop) in the list
        static boolean hasCycle(Node head) {
            if (head == null) return false;
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
            return false;
        }

        // Utility: print the list up to a certain number of nodes to avoid infinite loops
        static void printList(Node head) {
            Node curr = head;
            int count = 0, limit = 20;
            while (curr != null && count++ < limit) {
                System.out.print(curr.data + " → ");
                curr = curr.next;
            }
            if (curr != null) System.out.print("…");
            System.out.println("null");
        }

        public static void main(String[] args) {
            // Build list: 1 → 2 → 3 → 4 → 5
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            System.out.println("Original list:");
            printList(head);

            // Find middle
            Node mid = findMiddle(head);
            System.out.println("Middle node data: " + (mid != null ? mid.data : "none"));

            // Reverse list
            head = reverse(head);
            System.out.println("Reversed list:");
            printList(head);

            // Create a cycle for test (link tail to node with data=3)
            head.next.next.next.next = head.next.next; // 5 → (3)
            System.out.println("Cycle introduced.");
            System.out.println("Has cycle? " + hasCycle(head));
        }
    }

