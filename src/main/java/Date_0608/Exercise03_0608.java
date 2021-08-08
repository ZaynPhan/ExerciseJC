package Date_0608;
//Giải phương trình bậc nhất ax + b = 0.

import java.util.Scanner;

public class Exercise03_0608 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a và b: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float x = (-b) / a;
        if (a == 0) {
            if (b == 0){
            System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            System.out.println("Nghiệm của phương trình ax + b là x = " + x);
        }
    }
}
