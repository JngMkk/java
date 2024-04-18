package common;

public class BoundedGenericMethod {
    public static void main(String[] args) {
        GenericBox<Double> dBox = BoundedGenericMethodBoxMaker.makeBox(new Double(1.1));
        double d = BoundedGenericMethodUnBoxer.openBox(dBox);
        System.out.println("Returned data: " + d);
    }
}
