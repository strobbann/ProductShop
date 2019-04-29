import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        UserIO userIO = new UserIO();
        FileIO fileIO = new FileIO();
        userIO.readFromUser();
    }

    public Product chooser(String string) throws IOException {
        String className;
        switch (className = StringHandler.getStringFromArrayTrimmed(1, string)) {
            case "Trousers": {
                return new Trousers(string);
            }
            case "Hat": {
                return new Hat(string);
            }
            case "Shirt": {
                return new Shirt(string);
            }
        }
        
        throw new IOException("invalid input");
    }
}
