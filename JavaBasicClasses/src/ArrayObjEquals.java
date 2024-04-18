import java.util.Arrays;

class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }
}

class INum2 {
    private int num;

    public INum2(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum2) obj).num;
    }
}

/*
    Arrays.equals() 메서드는 Object형 배열에 대해서도 오버로딩 되어 있음.
        public static boolean equals(Object[] a, Object[] a2)

        이 메서드는 참조 값이 아닌 참조하는 인스턴스의 내용을 비교함.
        그리고 이때 Object 클래스에 정의된 equals 메서드가 사용됨.
*/
public class ArrayObjEquals {
    public static void main(String[] args) {
        INum[] ar3 = new INum[3];
        INum[] ar4 = new INum[3];
        ar3[0] = new INum(1); ar4[0] = new INum(1);
        ar3[1] = new INum(2); ar4[1] = new INum(2);
        ar3[2] = new INum(3); ar4[2] = new INum(3);
        System.out.println(Arrays.equals(ar3, ar4));    // false

        /*
            배열의 비교결과가 false로 나오는 이유는 Object 클래스에 정의되어 있는 equals 메서드가 다음과 같이 정의되어 있기 때문.

            public boolean equlas(Object obj) {
                if (this == obj)
                    return true;
                else
                    return false;
            }

            Object 클래스에 정의된 equals 메서드는 참조 값 비교를 함.
            따라서 배열의 참조 값 비교가 아닌 내용 비교가 목적이라면 equals 메서드를 목적에 맞게 오버라이딩 해야 함.
        */
        INum2[] ar1 = new INum2[3];
        INum2[] ar2 = new INum2[3];
        ar1[0] = new INum2(1); ar2[0] = new INum2(1);
        ar1[1] = new INum2(2); ar2[1] = new INum2(2);
        ar1[2] = new INum2(3); ar2[2] = new INum2(3);
        System.out.println(Arrays.equals(ar1, ar2));    // true
    }
}
