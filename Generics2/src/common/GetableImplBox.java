package common;

public class GetableImplBox<T> implements Getable<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    @Override
    public T get() {
        return obj;
    }
}
