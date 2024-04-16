/*
    Object 클래스에는 인스턴스의 복사를 위한 메서드가 정의되어 있음.
        protected Object clone() throws CloneNotSupportedException

    이 메서드가 호출되면, 호출된 메서드가 속한 인스턴스의 복사본이 생성되고, 이렇게 만들어진 복사본의 참조 값이 반환됨.
    단, 다음 인터페이스를 구현한 인스턴스를 대상으로만 위 메서드를 호출할 수 있음.
        interface Cloneable
            -> 이 인터페이스를 구현한 클래스의 인스턴스만 clone 메서드 호출 가능

    만약에 Cloneable 인터페이스를 구현하지 않은 클래스의 인스턴스를 대상으로 clone 메서드를 구현하면 CloneNotSupportedException이 발생.

    사실 Cloneable 인터페이스는 '마커 인터페이스'.
    즉 정의해야 할 메서드가 존재하지 않는, 복사를 해도 된다는 표식의 인터페이스.

    인스턴스의 복사는 클래스에 따라 허용되어서는 안되는 작업이 될 수 있음.
    따라서 인스턴스 복사의 허용 여부는 클래스를 정의하는 과정에서 고민하고 결정해야 함.
    그리고 복사를 허용해도 된다는 결론이 나오면 Cloneable 인터페이스를 구현해서 clone 메서드의 호출이 가능하도록 하면 됨.
*/
class Point implements Cloneable {
    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d %d]\n", xPos, yPos);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class InstanceCloning {
    public static void main(String[] args) {
        Point org = new Point(1, 5);
        Point cpy;

        try {
            cpy = (Point) org.clone();
            org.showPosition();
            cpy.showPosition();
            System.out.println(org);
            System.out.println(cpy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
