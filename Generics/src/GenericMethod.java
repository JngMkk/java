import common.GenericBox;
import common.GenericMethodBoxMaker;

public class GenericMethod {
    public static void main(String[] args) {
        GenericBox<String> sBox = GenericMethodBoxMaker.makeBox("Sweet");
        System.out.println(sBox.get());

        GenericBox<Double> dBox = GenericMethodBoxMaker.makeBox(9.9);
        System.out.println(dBox.get());
    }
}
