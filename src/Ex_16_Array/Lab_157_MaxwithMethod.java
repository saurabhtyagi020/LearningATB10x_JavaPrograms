package Ex_16_Array;

public class Lab_157_MaxwithMethod {
    public static void main(String[] args) {
        int array []= {23,45,65,76,87,90};
       int max1= giveMax(array);
        System.out.println(max1);
    }

    static int giveMax(int [] a)
    {

        int max = a[0];
        for(int i =0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
     return max;
    }
}
