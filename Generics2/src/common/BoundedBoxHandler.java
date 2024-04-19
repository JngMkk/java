package common;

public class BoundedBoxHandler {
    public static void outBox(Box<? extends Toy> box) {
        /*
            이 메서드에서는 box가 참조하는 인스턴스에 Toy 인스턴스를 저장하는 메서드 호출은 불가능함.
        */
        Toy t = box.get();
        System.out.println(t);

//        box.set(new Toy());   // 컴파일 오류
    }

    public static void inBox(Box<? super Toy> box, Toy n) {
        /*
            이 메서드에서는 box가 참조하는 인스턴스에서 Toy 인스턴스를 꺼내는 메서드 호출은 불가능.
        */
        box.set(n);
//        Toy myToy = box.get();        // 컴파일 오류
//        System.out.println(myToy);
    }
}
