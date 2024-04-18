package common;

public class BoundedGenericMethodBoxMaker {
    public static <T extends Number> GenericBox<T> makeBox(T o) {
        GenericBox<T> box = new GenericBox<>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}
