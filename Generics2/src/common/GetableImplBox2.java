package common;

public class GetableImplBox2<T> implements Getable<String> {
    private T obj;
    public void set(T o) { obj = o; }
    @Override
    public String get() {       // 반환형은 T가 아닌 String이어야 함.
        return obj.toString();
    }
}
