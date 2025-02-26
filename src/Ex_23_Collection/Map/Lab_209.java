package Ex_23_Collection.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab_209 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Name","Saurabh");
        map.put("Add","GZB");
        map.put("MNo","827364");
        map.put(null,"2334");
        map.put(null,null);
        map.put("2763",null);

        System.out.println(map);
        System.out.println(map.size());




    }
}
