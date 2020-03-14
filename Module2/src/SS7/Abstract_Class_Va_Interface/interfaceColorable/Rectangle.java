package SS7.Abstract_Class_Va_Interface.interfaceColorable;

import SS7.Abstract_Class_Va_Interface.interfaceResizeable.Resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public void resize(double percent) {
        this.width *= percent;
        this.length *= percent;
    }

    @Override
    public String toString() {
        return ("A systemOfGeometricObjects.Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " + super.toString());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
