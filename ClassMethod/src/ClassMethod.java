class NumberPrinter {
    private int myNum = 0;

    /*
        클래스 내에 정의된 메서드에 static 선언을 하면 '클래스 메서드'가 됨.
        그리고 클래스 메서드는 그 성격이 클래스 변수와 유사함.
        접근 방법도 동일하며 인스턴스 생성 이전ㄴ부터 호출이 가능한, 그리고 어느 인스턴스에도 속하지 않는 메서드라는 점도 동일.
    */
    static void showInt(int n) {        // 클래스 메서드
        System.out.println(n);
    }
    static void showDouble(double n) {  // 클래스 메서드
        System.out.println(n);
    }

    void setMyNumber(int n) {           // 인스턴스 메서드
        myNum = n;
    }
    void showMyNumber() {
        showInt(myNum);         // 클래스 내부에서 클래스 메서드 호출
    }
}

class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);          // 클래스 이름을 통한 클래스 메서드 호출

        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);                // 인스턴스 이름을 통한 클래스 메서드 호출
        np.setMyNumber(75);
        np.showMyNumber();
    }
}
