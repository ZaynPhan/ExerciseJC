package Date_1109;

import java.util.Scanner;

//Hình dạng đất
public class LandShape {
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

    public void fromConsole(Scanner input) {
    }

    public double getLandArea() {
        return 0;
    }

    public double getPricePerLand() {
        return pricePerUnit * landArea;
    }
}

