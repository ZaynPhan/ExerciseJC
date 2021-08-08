package Date_0608;
//Cho ngày, tháng, năm – day, month, year, yêu cầu:
//a. Xét xem ngày, tháng, năm này có hợp lệ hay không?
//  21/3/2021 🡪 hợp lệ.
//  29/2/2021 🡪 không hợp lệ.
//  29/2/2020 🡪 hợp lệ.
//  30/12/2019 🡪 hợp lệ.
//b. Tính toán ngày sau đó 1 ngày.
//c. Tính toán ngày trước đó 1 ngày.

import java.util.Scanner;

public class ExercisePractice03_02_0608 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập lần lượt ngày, tháng, năm: ");
        int date = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        if (month >= 1 && month <= 12 && year > 0) {
            if((month == 4)||(month == 6)||(month ==9)||(month == 11)){
                if (date >=1 && date <=30) {
                    System.out.println("Đây là ngày, tháng, năm hợp lệ");
                    int date_after_1_date = date + 1;
                    System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                    int date_before_1_date = date - 1;
                    System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                }
            }
            if((month == 1)||(month == 3)||(month ==5)||(month == 7)||(month == 8)||(month ==10)||(month == 12)) {
                if ((date >=1 && date <=31)) {
                    System.out.println("Đây là ngày, tháng, năm hợp lệ");
                    if(month == 1 && date == 1){
                        int date_after_1_date = date + 1;
                        System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                        int date_before_1_date = 31;
                        month = 12;
                        year = year - 1;
                        System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                    } else if (month == 12 && date == 31){
                        int date_after_1_date = 1;
                        int monthNext = 1;
                        year = year + 1;
                        System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + monthNext + " "+ year);
                        int date_before_1_date = date - 1 ;
                        System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                    } else {
                        int date_after_1_date = date + 1;
                        System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                        int date_before_1_date = date - 1;
                        System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                    }
                }
            }
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if(date >=1 && date <=29){
                        System.out.println("Đây là ngày, tháng của năm nhuận!!!");
                        if(date == 29){
                            int date_after_1_date = 1;
                            int monthNext = month + 1;
                            System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + monthNext + " "+ year);
                            int date_before_1_date = date - 1;
                            System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                        }else if (date == 1){
                            int date_after_1_date = date + 1;
                            System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                            int date_before_1_date = 31;
                            int previousMonth = 1;
                            System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + previousMonth + " "+ year);
                        } else {
                            int date_after_1_date = date + 1;
                            System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                            int date_before_1_date = date - 1;
                            System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                        }
                    }else{
                        System.out.println("Đây không phải là ngày, tháng, năm hợp lệ");
                    }
                } else {
                    if(date >=1 && date <=28) {
                        System.out.println("Đây là ngày, tháng, năm hợp lệ");
                        if (date == 28) {
                            int date_after_1_date = 1;
                            int monthNext = month + 1;
                            System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date + " " + monthNext + " " + year);
                            int date_before_1_date = date - 1;
                            System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date + " " + month + " " + year);
                        }else if (date == 1){
                            int date_after_1_date = date + 1;
                            System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                            int date_before_1_date = 31;
                            int previousMonth = 1;
                            System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + previousMonth + " "+ year);
                        }else{
                            int date_after_1_date = date + 1;
                            System.out.println("Ngày sau đó 1 ngày là: " + date_after_1_date +" " + month + " "+ year);
                            int date_before_1_date = date - 1;
                            System.out.println("Ngày trước đó 1 ngày là: " + date_before_1_date +" " + month + " "+ year);
                        }
                    }else{
                        System.out.println("Đây không phải là ngày, tháng, năm hợp lệ");
                    }
                }
            }
        } else {
            System.out.println("Đây không phải là ngày, tháng, năm hợp lệ");
        }
    }
}
