package common;

public class BoxHandler {
    public static void outBox(Box<Toy> box) {
        Toy t = box.get();
        box.set(new Toy());
        System.out.println(t);
    }

    public static void inBox(Box<Toy> box, Toy n) {
        box.set(n);
    }
}
