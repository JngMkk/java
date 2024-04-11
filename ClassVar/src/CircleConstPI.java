class Circle {
    static final double PI = 3.1415;    // PI가 지닌 값은 '원주율'로 결코 변하지 않는 값이기 때문에 인스턴스 변수가 아닌 클래스 변수로 선언
    private double radius;

    Circle(double rad) {
        radius = rad;
    }
    void showPerimeter() {
        double peri = (radius * 2) * PI;
        System.out.println("둘레: " + peri);
    }
    void showArea() {
        double area = (radius * radius) * PI;
        System.out.println("넓이: " + area);
    }
}

class CircleConstPI {
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        c.showPerimeter();
        c.showArea();
    }
}
