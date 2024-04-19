import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car implements Comparable<Car> {
    protected int disp;

    public Car(int d) {
        disp = d;
    }

    @Override
    public String toString() {
        return "cc: " + disp;
    }

    @Override
    public int compareTo(Car o) {
        return disp - o.disp;
    }
}

class ECar extends Car {
    private int battery;

    public ECar(int d, int b) {
        super(d);
        battery = b;
    }

    @Override
    public String toString() {
        return "cc: " + disp + ", ba: " + battery;
    }
}

class CarComp implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.disp - c2.disp;
    }
}

public class sortCollection2 {
    public static void main(String[] args) {
        List<Car> lst = new ArrayList<>();
        lst.add(new Car(1200));
        lst.add(new Car(3000));
        lst.add(new Car(1800));
        Collections.sort(lst);

        for (Car c : lst)
            System.out.println(c.toString() + " ");

        List<ECar> lst2 = new ArrayList<>();
        lst2.add(new ECar(1200, 99));
        lst2.add(new ECar(3000, 55));
        lst2.add(new ECar(1800, 85));
        Collections.sort(lst2);

        for (ECar ec : lst2)
            System.out.println(ec.toString() + " ");

        List<Car> lst3 = new ArrayList<>();
        lst3.add(new Car(1200));
        lst3.add(new Car(3000));
        lst3.add(new Car(1800));

        List<ECar> lst4 = new ArrayList<>();
        lst4.add(new ECar(1200, 99));
        lst4.add(new ECar(3000, 55));
        lst4.add(new ECar(1800, 85));

        CarComp comp = new CarComp();

        Collections.sort(lst3, comp);
        Collections.sort(lst4, comp);

        for (Car c : lst3)
            System.out.println(c.toString() + " ");

        for (ECar ec : lst4)
            System.out.println(ec.toString() + " ");
    }
}
