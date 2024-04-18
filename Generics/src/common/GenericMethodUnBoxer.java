package common;

public class GenericMethodUnBoxer {
    public static <T> T openBox(GenericBox<T> box) {
        return box.get();
    }
}
