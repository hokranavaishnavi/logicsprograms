package DSA.Assignment8;

import java.util.*;

public class SlidingWindowMaxMin {



        public static List<int[]> slidingWindowMaxMin(int[] arr, int k) {
            int n = arr.length;
            List<int[]> result = new ArrayList<>();

            Deque<Integer> maxDeque = new ArrayDeque<>();
            Deque<Integer> minDeque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {

                // Remove elements out of current window
                if (!maxDeque.isEmpty() && maxDeque.peekFirst() <= i - k)
                    maxDeque.pollFirst();
                if (!minDeque.isEmpty() && minDeque.peekFirst() <= i - k)
                    minDeque.pollFirst();

                // Maintain decreasing deque for max
                while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] <= arr[i])
                    maxDeque.pollLast();

                // Maintain increasing deque for min
                while (!minDeque.isEmpty() && arr[minDeque.peekLast()] >= arr[i])
                    minDeque.pollLast();

                maxDeque.offerLast(i);
                minDeque.offerLast(i);

                // Add result when window of size k is formed
                if (i >= k - 1) {
                    int max = arr[maxDeque.peekFirst()];
                    int min = arr[minDeque.peekFirst()];
                    result.add(new int[]{max, min});
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {4, 2, 12, 3, -1, 6, 8, 5};
            int k = 3;

            List<int[]> res = slidingWindowMaxMin(arr, k);
            System.out.println("Window results (max, min):");
            for (int[] pair : res) {
                System.out.println(Arrays.toString(pair));
            }
        }
    }


