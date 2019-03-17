package bikes;

public class Bike {
    private Color color;
    private double tireWidth;
    private boolean aluminium;
    private double price;

    public Bike(Color color, double tireWidth, boolean aluminium) {
        this.color = color;
        this.tireWidth = tireWidth;
        this.aluminium = aluminium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(double tireWidth) {
        this.tireWidth = tireWidth;
    }

    public boolean isAluminium() {
        return aluminium;
    }

    public void setAluminium(boolean aluminium) {
        this.aluminium = aluminium;
    }
}
