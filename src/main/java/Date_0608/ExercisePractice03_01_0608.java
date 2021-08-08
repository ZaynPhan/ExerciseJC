package Date_0608;
//Viết chương trình xét 1 năm có phải năm nhuận hay không?

import java.util.Scanner;

public class ExercisePractice03_01_0608 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = input.nextInt();
        if (year >= 0){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Đây là năm nhuận!");
            } else {
                System.out.println("Đây không phải năm nhuận!");
            }
        } else {
            System.out.println("Đây không phải là dữ liệu số năm!!!");
        }
    }
}
