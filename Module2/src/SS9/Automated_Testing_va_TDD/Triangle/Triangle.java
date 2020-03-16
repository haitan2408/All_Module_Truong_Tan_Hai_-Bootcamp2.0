package SS9.Automated_Testing_va_TDD.Triangle;

public class Triangle {
    public static String triangleClassifier(int side1, int side2, int side3) {
        if (isaBoolean(side1 > 0, side2 > 0, side3 > 0)) {
            if (isaBoolean(side1, side2) && isaBoolean(side1, side3)) {
                return "Tam giac deu";
            } else if (isaBoolean(side1, side2) || isaBoolean(side2, side3) || isaBoolean(side1, side3)) {
                return "Tam giac can";
            } else if (isaBoolean(side2 < side1 + side3, side1 < side2 + side3, side3 < side1 + side2)) {
                return "Tam giac thuong";
            }
        }
        return "khong phai tam giac";
    }

    private static boolean isaBoolean(int side1, int side2) {
        return side1 == side2;
    }

    private static boolean isaBoolean(boolean b, boolean b2, boolean b3) {
        return b && b2 && b3;
    }
}
