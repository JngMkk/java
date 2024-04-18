package common;

public class GenericMethodBoxMaker {
    public static <T> GenericBox<T> makeBox(T o) {
        GenericBox<T> box = new GenericBox<>();
        box.set(o);
        return box;
    }
}
