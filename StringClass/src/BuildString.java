/*
    StringBuilder 클래스는 내부적으로 문자열을 저장하기 위한 메모리 공간을 지님.
    이 메모리 공간은 String 클래스의 메모리 공간과 달리 문자를 추가하거나 삭제하는 것이 가능함.
    따라서 수정하면서 유지해야 할 문자열이 있다면 이 클래스에 그 내용을 담아서 관리하는 것이 효율적임.

    대표적인 메서드
        public StringBulider append(int i): 기본 자료형 데이터를 문자열 내용에 추가
        public StringBuilder delete(int start, int end): 인덱스 start에서부터 end 이전까지의 내용을 삭제
        public StringBuilder insert(int offset, String str): 인덱스 offset의 위치에 str에 전달된 문자열 추가
        public StringBuilder replace(int start, int end, String str): 인덱스 start에서부터 end 이전까지의 내용을 str의 문자열로 대체
        public StringBuilder reverse(): 저장된 문자열의 내용을 뒤집음.

    StringBuilder: Non Thread safe
    StringBuffer: Thread safe
*/
class BuildString {
    public static void main(String[] args) {
        StringBuilder stbuf = new StringBuilder("123");
        stbuf.append(45678);
        System.out.println(stbuf);

        stbuf.delete(0, 2);
        System.out.println(stbuf);

        stbuf.replace(0, 3, "AB");
        System.out.println(stbuf);

        stbuf.reverse();
        System.out.println(stbuf);

        String sub = stbuf.substring(2, 4);
        System.out.println(sub);

        /*
            StringBuilder 메모리 공간의 크기를 인스턴스 생성 과정에서 지정해줄 수 있음.
            StringBuilder 인스턴스는 메모리 공간을 스스로 관리함.
            즉 부족하면 그 공간을 늘리지만, 이는 소모가 많은 작업.
            따라서 사용 계획에 따라 적절한 크기를 초기에 만들면 그만큼의 성능 향상을 기대할 수 있음.

            public StringBuilder(): 16개의 문자를 저장할 수 있는 메모리 공간 확보
            public StringBuilder(int cap): cap개의 문자를 저장할 수 있는 메모리 공간 확보
            public StringBuilder(String str): 전달되는 문자열과 16개의 문자를 저장할 수 있는 메모리 공간 확보
        */
    }
}
