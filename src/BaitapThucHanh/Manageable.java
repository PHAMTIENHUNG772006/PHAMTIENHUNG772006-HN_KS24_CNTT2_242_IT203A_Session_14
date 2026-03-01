package BaitapThucHanh;

public interface Manageable<T> {
    void add(T t);

    void update(String id,T t);

    void delete(String id);

    void displayAll();
}
