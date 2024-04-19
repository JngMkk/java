import common.Getable;
import common.GetableImplBox2;
import common.Toy;

public class GenericInterface2 {
    public static void main(String[] args) {
        GetableImplBox2<Toy> box = new GetableImplBox2<>();
        box.set(new Toy());

        Getable<String> gt = box;
        System.out.println(gt.get());
    }
}
