package Ex_15_String_function;

public class Lab_122_String_all {
    public static void main(String[] args) {
        String name = "saurabh";
        String n2 ="saurabh";

        //1. charAt()
        System.out.println(name.charAt(3));//r

        //2. toUpperCase()
        System.out.println(name.toUpperCase());

        //3. toLowerCase()
        String name2= "SAURABH";
        System.out.println(name.toLowerCase());

        //4. contains()
        System.out.println(name.contains("a"));

        //6. replace()
        System.out.println(name.replace('a','o'));

        //7. equals()
        System.out.println(name.equals(n2));

        //8.equalIgnoreCase()
        System.out.println(name.equalsIgnoreCase(name2));

        //9.indexof()
        System.out.println(name.indexOf('b'));

        //10.concat()
        System.out.println(name.concat("tyagi"));

        //11.length()
        System.out.println(name.length());

        //12. subString()
        System.out.println(name.substring(3,6));

        //13. startWith()
        System.out.println(name.startsWith("s"));

        //14. endsWith()
        System.out.println(name.endsWith("Z"));

        //15. isEmpty()
        System.out.println(name.isEmpty());

        //16.isBlank()
        System.out.println(name.isBlank());

        String name3 = "    tyagi   ";

        //17. trim()
        System.out.println(name3.trim());

        //18. compare()
        System.out.println(name.compareTo("SAUARBH"));

        //19.lastIndexOf()
        System.out.println(name.lastIndexOf("h"));

        //20.replaceAll()
        System.out.println(name.replaceAll("saurabh","tya"));




    }
}
