package Date_0608;
//Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày

import java.util.Scanner;

public class Exercise08_0608 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tháng và năm: ");
        int month = input.nextInt();
        int year = input.nextInt();
        int[] month30Days = {4, 6, 9, 11};
        int[] month31Days = {1, 3, 5, 7, 8, 10, 12};
        if (month >= 1 && month <= 12 && year > 0) {
            for (int i = 0; i < month30Days.length; i++) {
                if (month == month30Days[i]) {
                    System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                }
            }
            for (int i = 0; i < month31Days.length; i++) {
                if (month == month31Days[i]) {
                    System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                }
            }
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                }
            }
        } else {
            System.out.println("Đây không phải là tháng và năm hợp lệ");
        }
    }
}
