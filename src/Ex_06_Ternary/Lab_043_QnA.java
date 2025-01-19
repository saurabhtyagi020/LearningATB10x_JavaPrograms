package Ex_06_Ternary;

public class Lab_043_QnA {
    public static void main(String[] args) {
        int num = 90;

        String grade= (num>=90&&num<=100)?"Grade A":(num>=80&&num<89)?"Grade B":(num>=70&&num<79)?"Grade C"
                :(num>=60&&num<69)?"Grade D":(num<=59&&num>=0)?"Grade F":"Not a vaild number!";

        System.out.println(grade);
    }
}
