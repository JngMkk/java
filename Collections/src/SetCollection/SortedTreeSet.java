package SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
    public static void main(String[] args) {
        // 오름차순
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(4);
        System.out.println("인스턴스 수: " + tree.size());

        for (int n : tree)
            System.out.print(n + " ");
        System.out.println();

        for (Iterator<Integer> it = tree.iterator(); it.hasNext();)
            System.out.print(it.next().toString() + " ");
        System.out.println();
    }
}
