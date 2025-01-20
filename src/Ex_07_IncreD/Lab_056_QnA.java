package Ex_07_IncreD;

public class Lab_056_QnA {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);//34
        System.out.println(a);//13

        //A--> exp1-->11 --a->11
        //B-->exp2-->11 -->a->12
        //C-->exp3-->12 -->a->13
    }
}
