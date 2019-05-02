import java.util.List;

public interface Repository {
    void add(String object);
    void searchByText(String text);
    void searchByClass(String text);
    void print();
    void list();
}
