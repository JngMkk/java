class UnsafeCircle {
    double rad = 0;
    final double PI = 3.14;

    public UnsafeCircle(double r) {
        setRad(r);
    }

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getArea() {
        return (rad * rad) * PI;
    }
}

class InfoHideCircle {
    private double rad = 0;     // 정보 은닉: 변수 rad는 클래스 내부에서만 접근을 허용하겠다.
    final double PI = 3.14;

    public InfoHideCircle(double r) {
        setRad(r);
    }

    /*
        변수 rad를 private으로 선언했으니, getter와 setter 메서드를 제공한다.
    */
    public void setRad(double r) {
        /*
            setter 메서드.
                - 인스턴스 변수의 값을 설정하는 용도로 정의된 메서드
                - 변수의 이름이 name일 때, 메서드 이름은 setName으로 짓는 것이 관례
        */
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getRad() {
        /*
            getter 메서드.
                - 인스턴스 변수의 값을 참조하는 용도로 정의된 메서드
                - 변수의 이름이 name일 때, 메서드 이름은 getName으로 짓는 것이 관례
        */
        return rad;
    }

    public double getArea() {
        return (rad * rad) * PI;
    }
}

public class InfoHide {
    public static void main(String[] args) {
        UnsafeCircle unSafeC = new UnsafeCircle(1.5);
        System.out.println(unSafeC.getArea());

        unSafeC.setRad(2.5);
        System.out.println(unSafeC.getArea());

        unSafeC.setRad(-3.3);
        System.out.println(unSafeC.getArea());

        unSafeC.rad = -4.5;   // 옳지 않은 접근 방법, 문제가 됨. => 접근을 허용하지 않도록 클래스를 설계할 필요가 있음.
        System.out.println(unSafeC.getArea());


        InfoHideCircle infoHideC = new InfoHideCircle(1.5);
        System.out.println("반지름: " + infoHideC.getRad());
        System.out.println("넓이: " + infoHideC.getArea());

        infoHideC.setRad(3.4);
        System.out.println("반지름: " + infoHideC.getRad());
        System.out.println("넓이: " + infoHideC.getArea());
    }
}
