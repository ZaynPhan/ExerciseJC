package Date_1109;

//-Hình tròn: trung-tâm, bán-kính

import java.util.Scanner;

public class Circle extends LandShape {
    protected int radius;
    final double PI = Math.PI;

    public Circle() {
    }

    public Circle(Point pointA, double landArea, double pricePerUnit, double pricePerLand, int radius) {
        super(pointA, landArea, pricePerUnit, pricePerLand);
        this.radius = radius;
    }

    //Tính diện tích đất
    @Override
    public double getLandArea() {
        return this.radius * this.radius * PI;
    }

    //Nhập thông tin đất
    @Override
    public void fromConsole(Scanner input) {
        System.out.println("Coordinates of the center point are: ");
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();
        this.pointA = new Point(x, y);

        System.out.print("The radius of circle land is: ");
        this.radius = input.nextInt();

        System.out.print("Price of 1 unit of square land: ");
        this.pricePerUnit = input.nextInt();
    }

    //Xuất thông tin đất
    @Override
    public String toString() {
        Circle circle = new Circle();
        final StringBuffer sb = new StringBuffer("Square Land {");
        sb.append("Center point = ").append(pointA.toString());
        sb.append(", radius = ").append(radius);
        sb.append(", land area = ").append(circle.getLandArea());
        sb.append(", price/unit = ").append(pricePerUnit);
        sb.append(", price/land = ").append(pricePerUnit * circle.getLandArea());
        sb.append('}');
        return sb.toString();
    }
}
