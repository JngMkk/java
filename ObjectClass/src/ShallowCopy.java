class Point2 implements Cloneable {
    private int xPos;
    private int yPos;

    public Point2(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d %d]\n", xPos, yPos);
    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle implements Cloneable {
    private Point2 upperLeft;
    private Point2 lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point2(x1, y1);
        lowerRight = new Point2(x2, y2);
    }

    public void getUpperLeft() {
        System.out.println(upperLeft);
    }

    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }

    public void showPosition() {
        System.out.print("좌측 상단: ");
        upperLeft.showPosition();

        System.out.print("우측 하단: ");
        lowerRight.showPosition();
    }

    public Object shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Rectangle deepCopy() throws CloneNotSupportedException {
        Rectangle cpy = (Rectangle) super.clone();

        cpy.upperLeft = (Point2) upperLeft.clone();
        cpy.lowerRight = (Point2) lowerRight.clone();

        return cpy;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle) org.shallowCopy();
            org.getUpperLeft();
            cpy.getUpperLeft();
            /*
                Point2@4617c264
                Point2@4617c264

                복사 후 두 인스턴스의 변수 upperLeft의 참조 값이 같은 것을 알 수 있음. (참조 값이 복사되었음)
            */
            org.changePos(2, 2, 7, 7);
            org.showPosition();
            cpy.showPosition();
            /*
                좌측 상단: [2 2]
                우측 하단: [7 7]
                좌측 상단: [2 2]
                우측 하단: [7 7]
            */

            cpy = org.deepCopy();
            org.getUpperLeft();
            cpy.getUpperLeft();
            org.changePos(3, 3, 8, 8);
            org.showPosition();
            cpy.showPosition();
            /*
                Point2@4617c264
                Point2@54bedef2
                좌측 상단: [3 3]
                우측 하단: [8 8]
                좌측 상단: [2 2]
                우측 하단: [7 7]
            */

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
