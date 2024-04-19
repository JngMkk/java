import common.Box;
import common.UnBoxer;

public class GenericWildCard {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("So Simple String");
        UnBoxer.peekBox(box);
    }
}
