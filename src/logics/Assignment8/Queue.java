package logics.Assignment8;

public class Queue {

        private int[] arr;

    // Points to first element in queue
        private int frontEnd;

    // Points to last element in queue
        private int rearEnd;


        private int size;

        public Queue(int size) {
            this.size = size;
            arr = new int[size];
            frontEnd = -1;
            rearEnd = -1;
        }

        // Check if Queue is empty
        public boolean isEmpty() {
            return frontEnd == -1;
        }

        // Check if Queue is full
        public boolean isFull() {
            return rearEnd == size - 1;
        }

        // Insert element in Queue
        public void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue Overflow! Cannot insert " + x);
                return;
            }

            if (frontEnd == -1) {
                frontEnd = 0; // First element insertion
            }

            arr[++rearEnd] = x;
            System.out.println(x + " inserted into queue");
        }

        // Remove element from Queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow! Cannot remove");
                return -1;
            }

            int value = arr[frontEnd];

            if (frontEnd == rearEnd) {
                frontEnd = rearEnd = -1;  // Queue became empty
            } else {
                frontEnd++;            // Move front to next element
            }

            return value;
        }

        // Peek front element
        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[frontEnd];
        }

        // Display queue items
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return;
            }

            System.out.print("Queue elements: ");
            for (int i = frontEnd; i <= rearEnd; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Testing Queue
        public static void main(String[] args) {
            Queue queue = new Queue(5);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            queue.display();

            System.out.println("Front element = " + queue.front());

            System.out.println("Dequeued = " + queue.dequeue());

            queue.display();

            System.out.println("Is queue empty? " + queue.isEmpty());
            System.out.println("Is queue full? " + queue.isFull());
        }
    }


