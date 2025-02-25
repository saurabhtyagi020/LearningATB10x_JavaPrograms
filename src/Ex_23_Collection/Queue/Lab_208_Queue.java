package Ex_23_Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_208_Queue {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Apple");
     //   queue.add(123);
       // queue.add('a');

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Iterator iterator = queue.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
