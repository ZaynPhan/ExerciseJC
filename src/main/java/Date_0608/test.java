package Date_0608;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập lần lượt ngày, tháng, năm: ");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        if ((month==1||month==3||month==5||month==7||month==8||month==10|month==12 && day>31)
        || (month==4||month==6||month==9||month==11 && day>30)
        || (year%4 == 0 && month==2 && day>29)
        || (year%4 !=0 && month==2 && day>28)
        || month>12 ){
            System.out.println("Khong hop le");
        }
    }
}
