import java.time.LocalDate;

class StaticInitialization {
    static String date;

    static {        // 클래스 로딩 시 단 한 번 실행이 되는 영역 (static 초기화 블록)
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }

    public static void main(String[] args) {
        System.out.println(date);
    }
}
