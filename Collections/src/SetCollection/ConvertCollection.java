package SetCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
        ArrayList<String> aList = new ArrayList<>(lst);

        for (String s: aList)
            System.out.print(s + " ");
        System.out.println();

        HashSet<String> set = new HashSet<>(aList);
        aList = new ArrayList<>(set);

        for (String s : aList)
            System.out.print(s + " ");
        System.out.println();
    }
}
