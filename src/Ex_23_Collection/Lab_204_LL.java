package Ex_23_Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_204_LL {
    public static void main(String[] args) {
        List student = new LinkedList();
        student.add("Vinit");
        student.add("Sumit");
        student.add("Vikas");
        student.add("Vikas");
        student.add("Rajan");

        System.out.println(student);

        Iterator iterator = student.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
}
}
