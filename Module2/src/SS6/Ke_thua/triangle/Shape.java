package SS6.Ke_thua.triangle;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        if (filled) {
            return ("A systemOfGeometricObjects.Shape with color of " + this.color + " and filled");
        } else {
            return ("A systemOfGeometricObjects.Shape with color of " + this.color + " and not filled");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
