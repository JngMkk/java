import common.*;

public class FriutAndBox2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        b1.set(new Apple());
        b2.set(new Orange());

        Apple ap = (Apple) b1.get();
        Orange og = (Orange) b2.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
