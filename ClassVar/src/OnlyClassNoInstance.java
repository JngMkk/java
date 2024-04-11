class InstCnt2 {
    static int instNum = 100;

    InstCnt2() {
        instNum++;
        System.out.println("인스턴스 생성: " + instNum);
    }
}

class OnlyClassNoInstance {
    public static void main(String[] args) {
        InstCnt2.instNum -= 15;                 // 인스턴스 생성 없이 instNum에 접근
        System.out.println(InstCnt2.instNum);   // 85 -> 클래스 변수는 인스턴스 생성 이전에 메모리 공간에 존재함.

        /*
            클래스 변수는 해당 클래스 정보가 가상머신에 의해 읽히는 순간 메모리 공간에 할당되고 초기화됨. (Class Loading)
            이러한 할당과 초기화는 위의 예제에서 보이듯이 인스턴스의 생성과 무관하게 이뤄짐.
                => 인스턴스 간에 데이터 공유가 필요한 상황에서 클래스 변수를 선언한다.
            따라서 다음과 같이 생성자를 통한 클래스 변수의 초기화를 진행하지 않도록 주의해야 함.

            class InstCnt {
                static int instNum = 100;
                InstCnt() {
                    instNum = 0;
                }
            }
        */
    }
}
