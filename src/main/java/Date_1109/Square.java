package Date_1109;

//-Hình vuông: topLeft, chiều-rộng

import java.util.Scanner;

public class Square extends LandShape {
    protected int sideLength;

    public Square() {
    }

    public Square(Point pointA,double landArea, double pricePer1Meter, double pricePerLand, int sideLength) {
        super(pointA,landArea, pricePer1Meter, pricePerLand);
        this.sideLength = sideLength;
    }

    //Tính diện tích đất
    @Override
    public double getLandArea() {
        return this.sideLength * this.sideLength;
    }

    //Nhập thông tin đất
    @Override
    public void fromConsole(Scanner input) {
        System.out.println("Coordinates of the top-left point are: ");
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();
        this.pointA = new Point(x, y);

        System.out.print("The side length of square land is: ");
        this.sideLength = input.nextInt();

        System.out.print("Price of 1 unit of square land: ");
        this.pricePerUnit = input.nextInt();
    }

    //Xuất thông tin đất
    @Override
    public String toString() {
        Square square = new Square();
        final StringBuffer sb = new StringBuffer("Square Land {");
        sb.append("Center point = ").append(pointA.toString());
        sb.append(", side length = ").append(sideLength);
        sb.append(", land area = ").append(square.getLandArea());
        sb.append(", price/unit = ").append(pricePerUnit);
        sb.append(", price/land = ").append(pricePerUnit * square.getLandArea());
        sb.append('}');
        return sb.toString();
    }
}
