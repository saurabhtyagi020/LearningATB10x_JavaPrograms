package Ex_23_Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_205_LL2 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Orange");
        list.add("Apple");
        list.add(123);

        System.out.println(list);

        List list2 = new LinkedList();
        list2.add(list);

        System.out.println(list2);

        Iterator iterator = list2.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
