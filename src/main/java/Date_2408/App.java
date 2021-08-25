package Date_2408;

import Date_2408.Fraction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //PHÂN SỐ:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input fraction a/b = ");
//        String input = sc.nextLine();
//
//        Fraction fr = Fraction.fromString(input);
//        fr.printFraction();
//        System.out.println();
//
//        //Rút gọn phân số:
//        System.out.format("Irreducible form of a/b = %d", fr.reduceFraction());

        //Tính tổng, hiệu, tích, thương hai phân số:
        Fraction fr1 = new Fraction(1, 3);
        Fraction fr2 = new Fraction(3, 5);

        System.out.print("Sum: ");
        fr1.sum2Fraction(fr2).printFraction();

        System.out.print("Subtraction: ");
        fr1.subtract2Fraction(fr2).printFraction();

        System.out.print("Multiply: ");
        fr1.multi2Fraction(fr2).reduceFraction().printFraction();

        System.out.print("Division: ");
        fr1.divide2Fraction(fr2).printFraction();

        //Kiểm tra phân số tối giản?
        if (fr1.isReduceFraction()) {
            System.out.format("%d is simplified: ", fr1);
        } else System.out.format("%d is NOT simplified: ", fr1);

        //Quy đồng hai phân số
        Fraction fr3 = new Fraction();

    }
}
