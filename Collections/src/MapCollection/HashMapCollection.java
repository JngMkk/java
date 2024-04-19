package MapCollection;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("B", 11);
        map.put("A", 33);
        map.put("C", 59);

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));

        map.remove("A");
        System.out.println(map.get("A"));
    }
}
