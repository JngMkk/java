package common;

public class LowerBoundedWildcardUnBoxer {
    public static void peekBox(Box<? super Integer> box) {  // T는 Integer 또는 Integer가 상속하는 클래스(부모 클래스)이어야 함.
        System.out.println(box);
    }
}
