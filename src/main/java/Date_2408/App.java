package Date_2408;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //PHÂN SỐ:
        System.out.println("=====FRACTION=====");

        Scanner sc = new Scanner(System.in);
//        System.out.print("Input fraction a/b = ");
//        String input = sc.nextLine();
//
//        Fraction fr = Fraction.fromString(input);
//        fr.printFraction();
//        System.out.println();

        //Nhập/Xuất phân số:
        Fraction fr = new Fraction();
        fr.inputFraction();
        fr.printFraction();

        //Kiểm tra phân số tối giản?
        if (fr.isReducible()) {
            System.out.format("%s IS SIMPLIFIED!", fr.fractionToString());
        } else System.out.format("%s is NOT simplified?!!", fr.fractionToString());

        //Rút gọn phân số:
        System.out.print("Irreducible form of a/b = ");
        fr.reduceFraction();

        //Kiểm tra âm hay dương?
        if (fr.isPositive()) {
            System.out.format("%s IS POSITIVE!", fr.fractionToString());
        } else System.out.format("%s is negative?!!", fr.fractionToString());

        //Tính tổng, hiệu, tích, thương hai phân số:
        Fraction fr1 = Fraction.fromString("1/3");
        Fraction fr2 = Fraction.fromString("4/11");

        System.out.print("Sum: ");
        fr1.sum2Fraction(fr2).printFraction();

        System.out.print("Subtraction: ");
        fr1.subtract2Fraction(fr2).printFraction();

        System.out.print("Multiply: ");
        fr1.multi2Fraction(fr2).printFraction();

        System.out.print("Division: ");
        fr1.divide2Fraction(fr2).printFraction();

        //So sánh 2 phân số
        if (fr1.compareTo(fr2) > 0) {
            System.out.format("%s > %s", fr1.fractionToString(), fr2.fractionToString());
        } else if (fr1.compareTo(fr2) < 0) {
            System.out.format("%s < %s", fr1.fractionToString(), fr2.fractionToString());
        } else {
            System.out.format("%s == %s", fr1.fractionToString(), fr2.fractionToString());
        }

        //Quy đồng hai phân số
        System.out.format("%s is reduced to common denominator with %s is ", fr1.fractionToString(), fr2.fractionToString());
        fr1.reduceFractionToCommonDenominator(fr2).printFraction();


        //ĐƠN THỨC ax^n
        System.out.println("=====MONOMIAL=====");

        //Nhập/xuất đơn thức
        Monomial mon = new Monomial();
        mon.inputMonomial();
        mon.printMonomial();

        //Tính tích, thương hai đơn thức
        Monomial mon1 = new Monomial();
        mon1.inputMonomial();

        Monomial multi = new Monomial();
        System.out.format("%s * %s = ", mon.monomialToString(), mon1.monomialToString());
        System.out.println(multi.multiMonomial(mon, mon1).monomialToString());

        Monomial divide = new Monomial();
        System.out.format("%s / %s = ", mon.monomialToString(), mon1.monomialToString());
        System.out.println(divide.divideMonomial(mon, mon1).monomialToString());

        //Tính đạo hàm cấp 1 đơn thức ax^n
        System.out.format("First degree of monomial %s is %s", mon.monomialToString(),
                mon.firstDegreeDerivative(mon).monomialToString());

        //Tính đạo hàm cấp k của đơn thức ax^n
        System.out.print("Input k: ");
        int k = sc.nextInt();
        System.out.format("Degree %dth of monomial %s is %s", k, mon.monomialToString(),
                mon.kThDegreeDerivative(mon, k).monomialToString());

        //Tính giá trị đơn thức tại x = x0
        System.out.print("Input x0: ");
        int x = sc.nextInt();
        mon.calculateWithX0(mon, x);


        //ĐIỂM TRONG MẶT PHẲNG OXY:
        System.out.println("=====POINTS IN COORDINATE PLANE OXY=====");

        //Nhập/Xuất tọa độ điểm
        Point a = new Point();
        a.inputPoint();
        a.printPoint();

        //Tính khoảng cách giữa hai điểm
        Point b = new Point();
        b.inputPoint();
        b.printPoint();

        System.out.format("Distance between (%d,%d) and (%d,%d) is ", a.getX(), a.getY(), b.getX(), b.getY());
        System.out.println(a.toPoint(b));

        //Tìm điểm đối xứng qua gốc toạ độ/trục Ox/Oy
        //Gốc tọa độ
        System.out.format("(%d,%d) is symmetric with (%d,%d) through O(0,0)\n", a.getX(), a.getY(),
                a.symmetricThoughO().getX(), a.symmetricThoughO().getY());

        //Trục Ox
        System.out.format("(%d,%d) is symmetric with (%d,%d) through Ox axis\n", a.getX(), a.getY(),
                a.symmetricOxWith().getX(), a.symmetricOxWith().getY());

        //Trục Oy
        System.out.format("(%d,%d) is symmetric with (%d,%d) through Oy axis\n", a.getX(), a.getY(),
                a.symmetricOyWith().getX(), a.symmetricOyWith().getY());

        //Kiểm tra điểm thuộc phần tư nào?
        Point c = new Point();
        c.inputPoint();
        c.inQuadrant();


        //Tam giác
        System.out.println("=====TRIANGLE=====");

        //Nhập/Xuất tam giác
        Triangle triangle = new Triangle();
        triangle.inputTriangle();
        triangle.printTriangle();

        //Tính chu vi, diện tích tam giác
        System.out.format("Perimeter is %d\n", triangle.perimeterTriangle());

        System.out.print("Area is ");
        System.out.println(triangle.areaTriangle());
    }
}

