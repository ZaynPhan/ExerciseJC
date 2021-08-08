package Date_0608;
//Giải phương trình bậc hai ax2 + bx + c = 0.

import java.util.Scanner;

public class Exercise04_0608 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a, b và c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int delta = b*b - 4*a*c;
        if(delta >= 0){
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Vậy nghiệm của phương trình là:" );
            System.out.println("X1 = " +x1);
            System.out.println("X2 = " +x2);
        }else{
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
