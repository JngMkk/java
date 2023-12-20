package HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // put(): key와 value를 추가할 수 있음.
        map.put("people", "사람");
        map.put("baseball", "야구");

        // get(): key에 해당하는 value를 얻을 때 사용.
        System.out.println(map.get("people"));
        System.out.println(map.get("java"));            // key에 해당하는 value가 없을 때 null이 리턴됨

        // getOrDefault(): key에 해당하는 value가 없을 때 default 값 지정
        System.out.println(map.getOrDefault("java", "자바"));

        // containsKey(): 해당 key가 있는지 boolean 리턴
        System.out.println(map.containsKey("people"));

        // remove(): 맵의 항목을 삭제. 해당 key의 항목을 삭제한 후 value 값 리턴
        System.out.println(map.remove("people"));
        System.out.println(map.remove("people"));   // 없으면 null

        // size(): 맵 요소의 개수를 리턴
        System.out.println(map.size());

        // keySet(): 맵의 모든 key를 모아서 리턴
        System.out.println(map.keySet());                           // 집합 자료형으로 리턴
        ArrayList<String> keyList = new ArrayList<>(map.keySet());  // ArrayList로 형 변환 가능
        System.out.println(keyList);

        /*
            맵의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는 것.
            가끔 Map에 입력된 순서대로 데이터를 가져오거나 입력한 key에 의해 정렬하도록 저장하고 싶을 수 있음.
            이럴 때는 LinkedHashMap 혹은 TreeMap을 사용함.
                - LinkedHashMap: 입력된 순서대로 데이터를 저장
                - TreeMap: 입력된 key의 오름차순으로 데이터를 저장
        */
    }
}
