package Ex_16_Array;

import java.util.Arrays;

public class Lab_154_SecondLarge {
    public static void main(String[] args) {
        int a[]= {11,22,44,44,66,22,77};
        Arrays.sort(a);

        System.out.println(a[a.length-2]);
    }
}
