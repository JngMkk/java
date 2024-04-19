package common;

public class UnBoxer {
    public static <T> T openBox(Box<T> box) {
        return box.get();
    }

    public static <T> void peekBox(Box<T> box) {
        System.out.println(box);
    }
}
