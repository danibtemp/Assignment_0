public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double side) {
        this.side = side;
        super.setDimensions(this.side, this.side, this.side);
    }

}
