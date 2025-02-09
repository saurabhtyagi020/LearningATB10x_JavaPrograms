package Ex_16_Array;

import java.util.Arrays;

public class Lab_149 {
    public static void main(String[] args) {
        int [] a= {23,45,67,76,86,66};

        Arrays.sort(a);
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        String [] name = {"Raja","Arun","Varun"};
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }

        boolean [] b ={true,false};
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }



    }
}
