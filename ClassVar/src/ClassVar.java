class InstCnt {
    /*
        static으로 선언된 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수.

        클래스 변수는 인스턴스 내에 존재하는 변수가 아니라 '어떠한 인스턴스에도 속하지 않는 상태로 메모리 공간에 딱 하나만 존재하는 변수'
        다만 이 변수가 선언된 클래스의 인스턴스들은 이 변수에 바로 접근할 수 있는 권한이 있을 뿐.
    */
    static int instNum = 0;     // 클래스 변수 (static 변수)

    InstCnt() {     // 생성자
        instNum++;
        System.out.println("인스턴스 생성: " + instNum);
    }
}

class ClassVar {
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();
    }
}
