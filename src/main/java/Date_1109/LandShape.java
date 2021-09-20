package Date_1109;

import java.util.Scanner;

//Hình dạng đất
public abstract class LandShape {
    protected Point pointA;
    protected double landArea, pricePerUnit, pricePerLand;

    public LandShape() {
    }

    public LandShape(Point pointA, double landArea, double pricePerUnit, double pricePerLand) {
        this.pointA = pointA;
        this.landArea = landArea;
        this.pricePerUnit = pricePerUnit;
        this.pricePerLand = pricePerLand;
    }

    public abstract void fromConsole(Scanner input);

    public abstract double getLandArea();

    public double getPricePerLand() {
        return pricePerUnit * landArea;
    }
}

