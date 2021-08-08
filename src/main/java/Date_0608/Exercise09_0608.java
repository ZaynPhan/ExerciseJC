package Date_0608;
//Nhập độ dài 3 cạnh
//Kiểm tra đó có phải là tam giác không?
//Và là tam giác gì?

import java.util.Scanner;

public class Exercise09_0608 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh: ");
        float a = input.nextInt();
        float b = input.nextInt();
        float c = input.nextInt();
        if (a + b > c){
            if (a == b && a == c && b == c){
                System.out.println("Đây là một tam giác đều!");
            }
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
                System.out.println("Đây là một tam giác cân!");
            }
            if((a * a + b * b == c * c) || ( a * a + c * c == b * b) || (c * c + b * b == a * a)){
                System.out.println("Đây là một tam giác vuông!");
            }
        }else{
            System.out.println("Đây không phải một tam giác!");
        }
    }
}
