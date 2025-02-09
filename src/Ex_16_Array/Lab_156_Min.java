package Ex_16_Array;

public class Lab_156_Min {
    public static void main(String[] args) {
        int a[]={11,23,34,667,10};

        int min = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
