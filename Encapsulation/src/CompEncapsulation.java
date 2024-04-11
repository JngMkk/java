// 예제2) 포함 관계로 캡슐화 완성하기

class SinivelCap {
    void take() {
        System.out.println("콧물x");
    }
}

class SneezeCap {
    void take() {
        System.out.println("재채기x");
    }
}

class SnuffleCap {
    void take() {
        System.out.println("코 뻥");
    }
}

class SinusCap2 {
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    void take() {
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}

class ColdPatient2 {
    void takeSinus(SinusCap2 cap) {
        cap.take();
    }
}

class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient2 suf = new ColdPatient2();
        suf.takeSinus(new SinusCap2());
    }
}
