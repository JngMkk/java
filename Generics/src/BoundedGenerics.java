import common.BoundedBox;

public class BoundedGenerics {
    public static void main(String[] args) {
        BoundedBox<Integer> iBox = new BoundedBox<>();
        iBox.set(24);

        BoundedBox<Double> dBox = new BoundedBox<>();
        dBox.set(5.99);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
