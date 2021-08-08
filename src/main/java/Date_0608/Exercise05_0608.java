package Date_0608;
//Nhập 4 số nguyên a, b, c và d.
//Tìm số có giá trị nhỏ nhất (min).

import java.util.Scanner;

public class Exercise05_0608 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a, b, c và d:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int min = Math.min(min1, min2);
        System.out.println("min = " + min);
    }
}
