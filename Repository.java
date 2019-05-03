import java.util.List;
import java.io.Serializable;

public interface Repository extends Serializable {
    void add(String object);
    void searchByText(String text);
    void searchByClass(String text);
    void print();
    void list();
}
