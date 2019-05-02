import java.io.IOException;

public class Main {
    private static String target = "/Users/Robert/Javacode/ProductShop/input.txt";

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Repository repository = new ProductRepository();
        FileIO fileIO = new FileIO(repository, target);
        UserIO userIO = new UserIO(repository, fileIO, target);
        userIO.readFromUser();
    }
}
