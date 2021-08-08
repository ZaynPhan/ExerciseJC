package Date_0408;//Bài 4
//Nhập năm sinh của mọt người
//Tính tuổi người đó

import java.util.Calendar;

public class Exercise04_0408 {
    public static void main(String[] args) {
        int yearOfBirth = 1995;
        Calendar c = Calendar.getInstance();
        int currentYear = c.get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;
        System.out.println(age);

    }
}