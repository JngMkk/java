import common.MultiBox;

public class MultiTypeGenerics {
    public static void main(String[] args) {
        MultiBox<String, Integer> b = new MultiBox<String, Integer>();
        b.set("Apple", 25);
        System.out.println(b);
    }
}
