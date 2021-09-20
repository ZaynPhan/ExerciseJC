package Date_1409.entities;

public abstract class Electric {
    protected int powerAmount;
    protected final double VAT = 0.1;

    public abstract void input();

    public abstract int electricBill();

    public Electric() {
    }

    public Electric(int powerAmount) {
        this.powerAmount = powerAmount;
    }

}
