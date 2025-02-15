package Ex_16_Array;

public class Lab_158_MinMethod {


   public static int giveMin(int array[])
    {

        int min =array[0];
        for(int i=0;i<array.length;i++) {
            if (array[i] < min) {
                min=array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int array[]= {12,45,67,87,9,45};
        int min=giveMin(array);
        System.out.println(min);
    }
}
