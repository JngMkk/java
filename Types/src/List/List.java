package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {
    public static void main(String[] args) {
        /*
            리스트는 배열과 비슷하지만 편리한 기능이 더 많은 자료형.
            리스트와 배열의 가장 큰 차이점은, 배열은 크기가 정해져 있지만 리스트는 변한다는 데 있음.

            ArrayList, Vector, LinkedList 등이 있음.
        */

        // 자바 J2SE 5.0 버전부터 객체를 포함하는 자료형은 어떤 객체를 포함하는지 명확하게 표현할 것을 권고하고 있음
        ArrayList<String> pitches = new ArrayList<>();

        // add(): 값을 추가할 수 있음. 삽입할 위치를 지정할 수도 있음.
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        pitches.add(3, "147");

        // get(): 특정 인덱스 값을 추출할 수 있음.
        System.out.println(pitches.get(1));

        // size(): ArrayList의 요소 개수를 리턴
        System.out.println(pitches.size());

        // contains(): 리스트 안에 해당 항목이 있는지 판별해 그 결과를 boolean으로 리턴
        System.out.println(pitches.contains("142"));

        // remove(객체): 요소가 존재하면 요소를 삭제하고 true, 존재하지 않으면 false 리턴
        System.out.println(pitches.remove("129"));
        System.out.println(pitches.remove("155"));

        // remove(인덱스): 인덱스에 해당하는 항목을 삭제한 뒤, 그 항목 리턴
        System.out.println(pitches.remove(0));
        // System.out.println(pitches.remove(11)); => IndexOutOfBoundsException 발생


        /*
            Generics

            제네릭스는 자바 J2SE 5.0 버전 이후에 도입된 개념으로, 자료형을 안전하게 사용할 수 있도록 만들어 주는 기능.
            제네릭스를 사용하면 자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류를 줄일 수 있음.

            - 일반적 방식: ArrayList<String> pitches = new ArrayList<String>();
            - 선호되는 방식: ArrayList<String> pitches = new ArrayList<>(); 뒷 부분의 자료형은 명확하므로 굳이 적지 않아도 됨.

            제네릭스를 표현한 <String>은 ArrayList에 담을 수 있는 자료형은 String이라는 것임.

            제네릭스를 사용하지 않으면 ArrayList에 추가하는 객체는 Object 자료형으로 인식됨.
            Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형.
            따라서 값을 넣을 때는 문제가 없지만 값을 가져올 때는 매번 Object 자료형에서 String 자료형으로 형 변환(casting)을 해야 함.
            이 때 주의할 점은 String 외의 다른 객체도 넣을 수 있어서 형 변환 오류가 발생할 수 있다는 것.
            제네릭스는 이러한 형 변환 오류를 방지하기 위함임.
        */

        String[] data = {"137", "129", "143"};
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2);

        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138", "129", "143"));
        System.out.println(pitches3);

        // join()
        String res = "";
        for (int i = 0; i < pitches.size(); i++) {
            res += pitches.get(i);
            res += ",";
        }
        res = res.substring(0, res.length() - 1);
        System.out.println(res);

        String res2 = String.join(",", pitches);
        System.out.println(res2);

        String res3 = String.join(",", data);       // 문자열 배열에도 사용 가능
        System.out.println(res3);

        // sort()
        pitches.sort(Comparator.naturalOrder());            // 오름차순으로 정렬
        System.out.println(pitches);
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);
    }
}
