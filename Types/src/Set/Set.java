package Set;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        /*
            집합 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 것으로 HashSet, TreeSet, LinkedHashSet 등이 있음.
            집합 자료형은 중복을 허용하지 않고 순서가 없음.
            리스트나 배열을 순서가 있기 때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만 집합 자료형은 순서가 없기 때문에 인덱싱으로 값을 얻을 수 없음.
        */
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersec = new HashSet<>(s1);
        // retainAll(): 교집합. 원래 객체 바뀜
        intersec.retainAll(s2);
        System.out.println(intersec);

        HashSet<Integer> union = new HashSet<>(s1);
        // addAll(): 합집합. 원래 객체 바뀜
        union.addAll(s2);
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        // removeAll(): 차집합. 원래 객체 바뀜
        substract.removeAll(s2);
        System.out.println(substract);

        // add(): 집합 자료형에 값을 추가할 때 사용
        HashSet<Integer> s3 = new HashSet<>();
        s3.add(1);
        s3.add(3);
        s3.add(3);
        System.out.println(s3);

        // addAll(): 값을 한꺼번에 여러 개 추가할 때
        s3.addAll(Arrays.asList(5, 7, 9));
        System.out.println(s3);

        // remove(): 특정 값을 제거할 때 사용
        s3.remove(1);
        System.out.println(s3);
        s3.removeAll(Arrays.asList(5, 7));
        System.out.println(s3);
    }
}
