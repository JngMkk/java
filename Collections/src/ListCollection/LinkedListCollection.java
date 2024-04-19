package ListCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        lst.add("Toy");
        lst.add("Box");
        lst.add("Robot");

        for (int i = 0; i < lst.size(); i++)
            System.out.print(lst.get(i) + "\t");
        System.out.println();

        lst.remove(0);

        for (int i = 0; i < lst.size(); i++)
            System.out.print(lst.get(i) + "\t");
        System.out.println();
    }
}
