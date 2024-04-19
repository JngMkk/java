package SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Toy");
        set.add("Box");
        set.add("Robot");
        set.add("Box");
        System.out.println("인스턴스 수: " + set.size());

        for (Iterator<String> it = set.iterator(); it.hasNext();)
            System.out.print(it.next() + " ");
        System.out.println();

        for (String s : set)
            System.out.print(s + " ");
        System.out.println();
    }
}
