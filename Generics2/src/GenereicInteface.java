import common.Getable;
import common.GetableImplBox;
import common.Toy;

public class GenereicInteface {
    public static void main(String[] args) {
        GetableImplBox<Toy> box = new GetableImplBox<>();
        box.set(new Toy());

        Getable<Toy> gt = box;
        System.out.println(gt.get());
    }
}
