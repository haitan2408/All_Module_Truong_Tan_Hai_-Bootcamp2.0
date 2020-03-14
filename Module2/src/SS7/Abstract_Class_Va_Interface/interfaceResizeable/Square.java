package SS7.Abstract_Class_Va_Interface.interfaceResizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }


    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide() * percent);
    }


    @Override
    public String toString() {
        return ("\"A systemOfGeometricObjects.Square with side = " + this.getSide() + ", which is a subclass of " + super.toString());
    }

    public static void main(String[] args) {
        Square[] square = new Square[3];

        square[0] = new Square(2.3);
        System.out.println(square[0]);

        square[1] = new Square(5.8);
        System.out.println(square[1]);

        square[2] = new Square(3);
        System.out.println(square[2]);
        square[2].resize(0.5);
        System.out.println(square[2]);

    }
}
