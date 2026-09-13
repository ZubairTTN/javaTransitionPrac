package collectionFrameworks.queueTut.priorityQueueTut;

/* PriorityQueue does not necessarily follow insertion order. Instead: The element with the highest priority is processed first. e.g., For the natural ordering of integers, the smallest number has the highest priority.*/

import java.util.PriorityQueue;

public class PriorityQueueTut {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        System.out.println(pq); /* Inserted:
50
10
30
20

Processing:
10
20
30
50 */
        System.out.println(pq.poll());
        System.out.println(pq);

        PriorityQueue<String> pqString = new PriorityQueue<>();
        pqString.add("Zubair");
        pqString.add("Akshita");
        pqString.add("Sonu");
        pqString.add("Kaushtub");
        pqString.add("Parth");
        System.out.println(pqString); /* System.out.println(pqString);
    Important Gotcha: Printing a PriorityQueue directly does not print a sorted list. It prints the underlying binary heap structure, which only guarantees that the first element is the highest priority. The rest of the elements will look out of order. */
        System.out.println(pqString.poll());
        System.out.println(pqString); /* Prints the remaining elements in the heap after "Akshita" has been removed and the heap has reorganized itself. */

    }
}

/* Internal Working:
* Java's PriorityQueue uses a heap, specifically a priority heap structure.
* For natural ordering, conceptually:

          10
        /    \
      20      30
     /
    50
    * The smallest element is at the root. Therefore pq.peek() -> 10*/
