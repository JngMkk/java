package common;

public class WildcardUnBoxer {
    public static <T> T openBox(Box<T> box) {
        return box.get();
    }

    public static void peekBox(Box<?> box) {    // 와일드카드 사용
        System.out.println(box);
    }
}
