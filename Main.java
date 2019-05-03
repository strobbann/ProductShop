import java.io.IOException;

public class Main {
    private static String target = "/Users/Robert/Javacode/ProductShop/input.txt";
    private static String targetSerial = "/Users/Robert/Javacode/ProductShop/input.ser";

    public static void main(String[] args) throws IOException {
        // Repository repository = new Repository();
        ObjectIO<Repository> objectIO = new ObjectIO<Repository>(targetSerial);
        Repository repositorySerialized = objectIO.readObject(targetSerial);

        FileIO fileIO = new FileIO(repositorySerialized, target);
        UserIO userIO = new UserIO(repositorySerialized, target, objectIO);

        userIO.readFromUser();
    }
}
