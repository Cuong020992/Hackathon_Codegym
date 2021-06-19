import java.util.List;

public interface GerenalManagement<T> {
    void display(List<T> list);

    void add(T t);

    void edit(T t);

    void delete(T t);

    List<T> find(String st);
}
