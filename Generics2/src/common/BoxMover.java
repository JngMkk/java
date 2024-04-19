package common;

public class BoxMover {
    // from에 저장된 내용물을 to로 이동
    public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
        to.set(from.get());

//        from.set(to.get());     // 컴파일 오류
    }
}
