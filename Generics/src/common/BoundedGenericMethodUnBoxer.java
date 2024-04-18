package common;

public class BoundedGenericMethodUnBoxer {
    public static <T extends Number> T openBox(GenericBox<T> box) {
        System.out.println("Unboxed data: " + box.get().intValue());
        return box.get();
    }
}
