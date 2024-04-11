// 예제1) 하나의 클래스로 캡슐화 완성하기
class SinusCap {
    void sniTake() {
        System.out.println("콧물 x");
    }
    void sneTake() {
        System.out.println("재채기 x");
    }
    void snuTake() {
        System.out.println("코 뻥");
    }

    void take() {   // 복용 방법 및 순서가 담긴 메서드
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient {
    void takeSinus(SinusCap cap) {
        cap.take();
    }
}

public class OneClassEncapsulation {
    public static void main(String[] args) {

        ColdPatient suf = new ColdPatient();
        suf.takeSinus(new SinusCap());
    }
}