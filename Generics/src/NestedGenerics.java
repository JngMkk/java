import common.GenericBox;

public class NestedGenerics {
    public static void main(String[] args) {
        // 참조변수 선언을 통해 <> 안에 String이 생략되었다고 컴파일러는 판단함.
        GenericBox<String> sBox = new GenericBox<>();
        sBox.set("I am so happy");

        GenericBox<GenericBox<String>> wBox = new GenericBox<>();
        wBox.set(sBox);

        GenericBox<GenericBox<GenericBox<String>>> zBox = new GenericBox<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
