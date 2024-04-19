package common;

public class UpperBoundedWildcardUnBoxer {
    public static void peekBox(Box<? extends Number> box) {
        System.out.println(box);
    }
}
