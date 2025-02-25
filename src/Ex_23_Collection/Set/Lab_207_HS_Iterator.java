package Ex_23_Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab_207_HS_Iterator {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add(123);
        set.add("Apple");
        set.add('a');
        set.add(null);
        set.add(true);

        HashSet HS= new HashSet();
        HS.addAll(set);

        System.out.println(HS);

        System.out.println("----------------For Each--------------");

        for(Object o: HS)
        {
            System.out.println(o);
        }
        System.out.println("----------------Iterator--------------");
        Iterator iterator = HS.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
