import common.Box;
import common.LowerBoundedWildcardUnBoxer;
import common.UpperBoundedWildcardUnBoxer;

public class GenericBoundedWildcard {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(1);

        Box<Double> dBox = new Box<>();
        dBox.set(1.1);

        UpperBoundedWildcardUnBoxer.peekBox(iBox);
        UpperBoundedWildcardUnBoxer.peekBox(dBox);

        Box<Integer> iBox2 = new Box<>();
        iBox2.set(2);

        Box<Number> nBox = new Box<>();
        nBox.set(23);

        Box<Object> oBox = new Box<>();
        oBox.set("My Object");

        LowerBoundedWildcardUnBoxer.peekBox(iBox2);
        LowerBoundedWildcardUnBoxer.peekBox(nBox);
        LowerBoundedWildcardUnBoxer.peekBox(oBox);
    }
}
