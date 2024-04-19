import common.Box;
import common.BoxMover;
import common.Toy;

public class BoundedWildcardUsage2 {
    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();
        Box<Toy> box2 = new Box<>();
        box1.set(new Toy());

        BoxMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}
