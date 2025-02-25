package Ex_23_Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_203_AL_Iterate {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Orange");
        list.add("Apple");
        list.add(123);
        list.add(true);
        list.addFirst('A');
        list.add("Apple");
        list.add(null);
        list.add("  ");
        list.addLast("Last");


        System.out.println(list);
        System.out.println(list.size());

        System.out.println("-----------for loop---------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------for Each---------");
        for (Object o : list)
        {
            System.out.println(o);
        }

        System.out.println("-----------Iterator---------");

        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
