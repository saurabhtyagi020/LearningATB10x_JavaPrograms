package Ex_23_Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab_206_HS {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add(123);
        set.add("Apple");
        set.add('a');
        set.add(null);
        set.add(true);

        System.out.println(set);



    }

}
