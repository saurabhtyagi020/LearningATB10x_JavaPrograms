package Ex_23_Collection.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_210 {

    public static void main(String[] args) {
        Hashtable<Integer,String> ht= new Hashtable();
        ht.put(1,"name");
        ht.put(2,"name1");
        ht.put(3,"name2");
      //  ht.put(null,"name3");
       // ht.put(null,"name4");
     //   ht.put(4,null);
        ht.put(3,"name2");

        System.out.println(ht);

        Enumeration<Integer> e  = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }






    }
}