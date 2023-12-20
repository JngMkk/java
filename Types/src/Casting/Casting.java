package Casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Casting {
    public static void main(String[] args) {
        // 문자열을 정수로 변환
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        // 정수를 문자열로 변환
        String intToStr = "" + n;
        String intToStr2 = String.valueOf(n);
        String intToStr3 = Integer.toString(n);
        System.out.println(intToStr);
        System.out.println(intToStr2);
        System.out.println(intToStr3);

        // 소수점 포함된 문자열을 실수 형태로 변환
        String f = "123.456";
        double d = Double.parseDouble(f);
        System.out.println(d);

        // 정수를 실수로 변환
        double d2 = n;
        System.out.println(d2);

        // 실수를 정수형으로 변환할 때는 반드시 캐스팅해 주어야 함.
        double d3 = 123.456;
        int n2 = (int) d3;
        System.out.println(n2);

        // final: 재할당 불가능 선언 (배열도 가능)
        final int x = 123;
        // x = 456; cannot assign a value to final variable x 오류 발생

        // arrayList의 경우 add, remove는 가능. 이것도 불가능하게 하려면 List.of 작성하여 수정할 수 없는 리스트로 만들면 됨.
        final ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        arr.add(4);
        arr.remove(0);
        System.out.println(arr);
        // arr = new ArrayList<>(Arrays.asList(2, 3)); 재할당 불가

        final List<String> lst = List.of("a", "b");
        // lst.add("c");    // UnsupportedOperationException
        System.out.println(lst);
    }
}
