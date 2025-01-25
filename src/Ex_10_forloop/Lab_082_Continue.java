package Ex_10_forloop;

public class Lab_082_Continue {
    public static void main(String[] args) {
        for(int i=0;i<=16;i++)
        {
            if(i==8)
            {
                continue;
            }
            System.out.println("i = " + i);
            
        }
    }
}
