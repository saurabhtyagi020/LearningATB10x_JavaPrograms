package Ex_16_Array;

public class Lab_155_Max {
    public static void main(String[] args) {

        int a[] = {11,33,56,77,45,89,68,87};
        int max =a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
