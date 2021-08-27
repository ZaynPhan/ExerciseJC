package Date_2408;

import java.util.Scanner;

//Tam giác
public class Triangle {
    private int a, b, c;

    public Triangle() {

    }

    //Nhập kích thước tam giác
    public void inputTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        this.a = input.nextInt();
        System.out.print("Input b: ");
        this.b = input.nextInt();
        System.out.print("Input c: ");
        this.c = input.nextInt();
    }

    //Xuất kích thước tam giác
    public void printTriangle() {
        if (this.a + this.b > this.c) {
            System.out.format("Dimensions of 3 sides of triagnle sequently are %d, %d and %d\n", this.a, this.b, this.c);
        } else System.out.println("This is NOT a triangle!!!");
    }

    //Tính chu vi tam giác
    public int perimeterTriangle() {
        return this.a + this.b + this.c;
    }

    //Tính diện tích tam giác
    public Double areaTriangle() {
        int halfPerimeter = perimeterTriangle() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
    }
}
