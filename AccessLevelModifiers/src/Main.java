/*
    access-level modifier (접근 수준 지시자)
        - public, protected, private, default 4가지가 있음.
        - 이 중 default는 키워드가 아닌, '아무런 선언도 하지 않은 상황'을 의미함.

        - class 정의 대상: public, default
            - class가 public으로 선언되면 위치에 상관없이 어디서든 해당 클래스의 인스턴스를 생성할 수 있음.
            - default로 선언되면 동일 패키지로 묶인 클래스 내에서만 인스턴스 생성이 가능함.

        - 인스턴스 변수와 메서드 대상: public, protected, private, default
            - 변수 혹은 메서드가 public으로 선언되면 위치에 상관없이 어디서든 호출 가능.
            - default로 선언되면 동일 패키지로 묶인 클래스 내에서 호출 가능.
            - private로 선언되면 클래스 내부에서만 접근 가능
            - protected로 선언되면 상속 관계에 있는 클래스에서 접근 가능 (다른 패키지라 하더라도)

*/

public class Main {
    public static void main(String[] args) {
    }
}