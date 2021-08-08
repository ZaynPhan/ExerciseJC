package Date_0608;
//2.Cho ngày, tháng, năm – day, month, year, yêu cầu:
//a.Xét xem ngày, tháng, năm này có hợp lệ hay không?
//  •21/3/2021  hợp lệ.
//  •29/2/2021  không hợp lệ.
//  •29/2/2020  hợp lệ.
//  •30/12/2019  hợp lệ.
//b.Tính toán ngày sau đó 1 ngày.
//c.Tính toán ngày trước đó 1 ngày.

import java.util.Scanner;

public class ExercisePractice03_02v2_0608 {
    public static void main(String[] args){
        System.out.println("========== Exercise 2 - Practice 3 ==========");
        checkDay();
    }

    //Method kiểm tra ngày, tháng, năm có hợp lệ không?
    public static void checkDay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int date = input.nextInt();
        System.out.println("Nhập tháng: ");
        int month = input.nextInt();
        System.out.println("Nhập năm: ");
        int year = input.nextInt();
        if (year > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(date > 0 && date <= 31) {
                        System.out.println("Ngày, tháng, năm hợp lệ");
                        previousDate(date, month, year);
                        nextDate(date, month, year);
                    }else{
                        System.out.println("Ngày, tháng, năm KHÔNG hợp lệ");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(date > 0 && date <= 30) {
                        System.out.println("Ngày, tháng, năm hợp lệ");
                        previousDate(date, month, year);
                        nextDate(date, month, year);
                    }else{
                        System.out.println("Ngày, tháng, năm KHÔNG hợp lệ");
                    }
                case 2:
                    if((year % 4 == 0&& year % 100 != 0) || (year % 400 == 0)){
                        if(date > 0 && date <= 29) {
                            System.out.println("Ngày, tháng, năm hợp lệ");
                            previousDate(date, month, year);
                            nextDate(date, month, year);
                        }else {
                            System.out.println("Ngày, tháng, năm KHÔNG hợp lệ");
                        }
                    }else{
                        if(date > 0 && date <= 28) {
                            System.out.println("Ngày, tháng, năm hợp lệ");
                            previousDate(date, month, year);
                            nextDate(date, month, year);
                        }else {
                            System.out.println("Ngày, tháng, năm KHÔNG hợp lệ");
                        }
                    }
                    break;
                default:
                    System.out.println("Ngày, tháng, năm KHÔNG hợp lệ!");
                    break;
            }
        } else {
            System.out.println("Ngày, tháng, năm KHÔNG hợp lệ!");
        }
    }

    //Method tính toán ngày trước đó 1 ngày
    public static void previousDate(int date, int month, int year){
        switch(month){
            case 1:
                if(date == 1) {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + 31 + "/" + 12 + "/" + (year-1));
                }else {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + (date - 1) + "/" + 1 + "/" + year);
                }
                break;
            case 3:
                if(date == 1) {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println("Ngày trước ngày đó 1 ngày là: " + 29 + "/" + (month - 1) + "/" + year);
                    } else {
                        System.out.println("Ngày trước ngày đó 1 ngày là: " + 28 + "/" + (month - 1) + "/" + year);
                    }
                } else{
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + (date - 1) + "/" + month + "/" + year);
                }
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(date == 1) {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + 30 + "/" + (month - 1) + "/" + year);
                }else {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + (date - 1) + "/" + month + "/" + year);
                }
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                if(date == 1) {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + 31 + "/" + (month - 1) + "/" + year);
                }else {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + (date - 1) + "/" + month + "/" + year);
                }
                break;
            default:
                System.out.println("Ngày, tháng, năm KHÔNG hợp lệ!");
                break;
        }
    }

    //Method tính toán ngày sau đó 1 ngày
    public static void nextDate(int date, int month, int year){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if(date == 31) {
                    System.out.println("Ngày sau ngày đó 1 ngày là: " + 1 + "/" + (month + 1) + "/" + year);
                }else {
                    System.out.println("Ngày sau ngày đó 1 ngày là: " + (date + 1) + "/" + month + "/" + year);
                }
            case 12:
                if(date == 31) {
                    System.out.println("Ngày sau ngày đó 1 ngày là: " + 1 + "/" + 1 + "/" + (year+1));
                }else {
                    System.out.println("Ngày sau ngày đó 1 ngày là: " + (date + 1) + "/" + month + "/" + year);
                }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    if(date == 29) {
                        System.out.println("Ngày sau ngày đó 1 ngày là: " + 1 + "/" + 3 + "/" + year);
                    }else {
                        System.out.println("Ngày sau ngày đó 1 ngày là: " + (date + 1) + "/" + month + "/" + year);
                    }
                } else {
                    if(date == 28) {
                        System.out.println("Ngày sau ngày đó 1 ngày là: " + 1 + "/" + 3 + "/" + year);
                    }else {
                        System.out.println("Ngày sau ngày đó 1 ngày là: " + (date + 1) + "/" + month + "/" + year);
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(date == 30) {
                    System.out.println("Ngày sau ngày đó 1 ngày là: " + 1 + "/" + (month + 1) + "/" + year);
                }else {
                    System.out.println("Ngày trước ngày đó 1 ngày là: " + (date + 1) + "/" + month + "/" + year);
                }
                break;
        }
    }
}
