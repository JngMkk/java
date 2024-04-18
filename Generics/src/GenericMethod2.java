import common.GenericBox;
import common.GenericMethodUnBoxer;

public class GenericMethod2 {
    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>();
        box.set("g method");

        String str1 = GenericMethodUnBoxer.<String>openBox(box);
        String str2 = GenericMethodUnBoxer.openBox(box);
        System.out.println(str1);
        System.out.println(str2);
    }
}
