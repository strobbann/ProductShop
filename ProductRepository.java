import java.util.List;
import java.util.ArrayList;
public class ProductRepository implements Repository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }
    @Override
    public void print() {
        products.forEach(System.out::println);
    }
    @Override()
    public void list() {
        products.forEach(p ->System.out.println(p.printAsTable()));
    }

    @Override
    public void searchByText(String text) {
        products.stream().filter(s -> s.toString().toLowerCase().contains(text.toLowerCase())).forEach(System.out::println);
    }

    @Override
    public void searchByClass(String text) {
        products.stream().filter(p -> p.getClassName().toLowerCase().equals(text.toLowerCase())).forEach(System.out::println);
    }

    @Override
    public void add(String object) {
        String classFromString = StringHandler.getStringFromArrayTrimmed(1, object);
        switch (classFromString) {
            case "Trousers": {
                products.add(new Trousers(object));
                break;
            } case "Hat": {
                products.add(new Hat(object));
                break;
            } case "Shirt": {
                products.add(new Shirt(object));
                break;
            } default : {
                break;
            }
        }
    }
}
