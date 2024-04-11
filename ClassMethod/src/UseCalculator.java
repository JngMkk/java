class SimpleCalculator {
    static final double PI = 3.1415;

    /*
        모두 외부에 기능을 제공하기 위한 메서드들.
        모두 인스턴스 변수의 값을 참조하거나 수정하지 않음.
            => 따라서 모든 메서드들은 인스턴스에 속할 필요가 없음. 불필요한 인스턴스의 생성 과정을 생략할 수 있음.
    */
    static double add(double n1, double n2) {
        return n1 + n2;
    }
    static double min(double n1, double n2) {
        return n1 - n2;
    }
    static double calCircleArea(double r) {
        return PI * r * r;
    }
    static double calCirclePeri(double r) {
        return PI * (r * 2);
    }
}

class UseCalculator {
    public static void main(String[] args) {
        System.out.println("3 + 4 = " + SimpleCalculator.add(3, 4));
        System.out.println("반지름 2.2, 원의 넓이: " + SimpleCalculator.calCircleArea(2.2));

        System.out.println("15 - 7 = " + SimpleCalculator.min(15, 7));
        System.out.println("반지름 5.0, 원의 둘레: " + SimpleCalculator.calCirclePeri(5.0));
    }
}
