package Enum;

public class Enum {
    // enum 자료형은 서로 연관 있는 여러 개의 상수 집합을 정의할 때 사용함.
    // 매직 넘버를 사용할 때보다 코드가 명확함, 잘못된 값을 사용해 생길 수 있는 오류 방지 가능
    enum CoffeeTypes {
        AMERICANO,
        ICED_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeTypes.AMERICANO);
        System.out.println(CoffeeTypes.ICED_AMERICANO);
        System.out.println(CoffeeTypes.CAFE_LATTE);

        for (CoffeeTypes type: CoffeeTypes.values()) {
            System.out.println(type);
        }
    }
}
