import common.*;

/*
    제네릭 기반의 클래스 정의하기

    제네릭이 등장하면서 자료형에 의존적이지 않은 클래스를 정의할 수 있게 됨.

    T는 인스턴스를 생성할 때 결정하면 됨.
    사과를 저장할 목적이면 T를 Apple로 결정하면 되고, 오렌지를 저장할 목적이면 T를 Orange로 결정하면 됨.
    이렇게 인스턴스 생성 시 T의 자료형을 결정하는 것이 '제네릭'.

    T는 '타입 매개변수'라 함. 메서드의 매개변수와 유사하게 자료형 정보를 인자로 전달받는 형태이기 때문.
    그리고 Box<Apple> aBox = new Box<Apple>(); 에서 Apple을 가리켜 '타입 인자'라 함.

    Box<Apple>을 가리켜 '매개변수화 타입'이라 함.
    자료형 Apple이 타입 매개변수 T에 전달되어 Box<Apple>이라는 새로운 자료형이 완성된 것이기 때문.
*/
public class FruitAndBoxGenerics {
    public static void main(String[] args) {
        // T를 Apple로 결정하여 인스턴스 생성. 따라서 Apple 또는 Apple을 상속하는 하위 클래스의 인스턴스 저장 가능.
        GenericBox<Apple> aBox = new GenericBox<Apple>();
        GenericBox<Orange> oBox = new GenericBox<Orange>();

        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple ap = aBox.get();
        Orange og = oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
