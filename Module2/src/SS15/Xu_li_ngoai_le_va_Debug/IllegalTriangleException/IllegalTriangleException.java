package SS15.Xu_li_ngoai_le_va_Debug.IllegalTriangleException;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");

    }
}
