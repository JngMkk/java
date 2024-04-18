import common.Apple;
import common.BoundedBoxByInterface;

public class BoundedGenericsByInterface {
    public static void main(String[] args) {
        BoundedBoxByInterface<Apple> box = new BoundedBoxByInterface<>();
        box.set(new Apple());

        Apple ap = box.get();
        System.out.println(ap);
    }
}
