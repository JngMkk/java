package MapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIter {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("B", 11);
        map.put("A", 33);
        map.put("C", 59);

        // Key만 담고 있는 컬렉션 인스턴스 생성
        Set<String> ks = map.keySet();

        for (String s : ks)
            System.out.print(s + " ");
        System.out.println();

        for (String s: ks)
            System.out.print(map.get(s) + " ");
        System.out.println();

        for (Iterator<String> it = ks.iterator(); it.hasNext();)
            System.out.print(map.get(it.next()) + " ");
        System.out.println();
    }
}
