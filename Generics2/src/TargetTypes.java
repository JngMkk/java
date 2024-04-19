import common.Box;
import common.EmptyBoxFactory;

public class TargetTypes {
    public static void main(String[] args) {
//        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        Box<Integer> iBox = EmptyBoxFactory.makeBox();
        iBox.set(25);
        System.out.println(iBox.get());
    }
}
