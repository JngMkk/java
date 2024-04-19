import common.BoundedBoxHandler;
import common.Box;
import common.Toy;

public class BoundedWildcardUsage {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoundedBoxHandler.inBox(box, new Toy());
        BoundedBoxHandler.outBox(box);
    }
}
