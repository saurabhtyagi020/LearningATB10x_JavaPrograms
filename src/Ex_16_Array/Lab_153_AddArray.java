package Ex_16_Array;

public class Lab_153_AddArray {
    public static void main(String[] args) {
        int a[] ={11,22,33};
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
        }
        System.out.println(sum);
    }
}
