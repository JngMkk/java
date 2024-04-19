package SetCollection;

import java.util.HashSet;
import java.util.Objects;

class Car {
    private String model;
    private String color;

    public Car(String m, String c) {
        model = m;
        color = c;
    }

    @Override
    public String toString() {
        return model + " : " + color;
    }

//    @Override
//    public int hashCode() {
//        return (model.hashCode() + color.hashCode()) / 2;
//    }

    /*
        클래스 정의할 때마다 hashCode를 정의하는 것은 번거로움.
        java.util.Objects에서는 다음 메서드 제공.
            public static int hash(Object... values)
    */
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public boolean equals(Object obj) {
        String m = ((Car) obj).model;
        String c = ((Car) obj).color;
        return model.equals(m) && color.equals(c);
    }
}

public class HowHashCode {
    public static void main(String[] args) {
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("H301", "RED"));
        set.add(new Car("H301", "BLACK"));
        set.add(new Car("H302", "RED"));
        set.add(new Car("H302", "WHITE"));
        set.add(new Car("H301", "RED"));

        System.out.println("인스턴스 수: " + set.size());

        for (Car car : set)
            System.out.println(car.toString());
    }
}
