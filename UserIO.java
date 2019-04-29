/*
 * Decompiled with CFR 0.139.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class UserIO {
    private String target = "/Users/Robert/Javacode/HomeWork4/input.txt";
    private FileIO fileIO = new FileIO();
    private Main main = new Main();

    public void readFromUser() {
        try {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
                String line;
                do {
                    System.out.println("Add To Create, SearchClass or SearchText, p to print\nq to quit");
                    switch (line = br.readLine()) {
                        case "Add": {
                            System.out.println("Productno, Class, Productname, description, price, [size], [color]\n");
                            line = br.readLine();
                            this.fileIO.writeToFile(line, this.target);
                            break;
                        }
                        case "SearchClass": {
                            System.out.println("Class Of Products");
                            line = br.readLine();
                            this.searchText(line, true);
                            break;
                        }
                        case "p": {
                            this.printProducts();
                            break;
                        }
                        case "SearchText": {
                            System.out.println("Text In Products");
                            line = br.readLine();
                            this.searchText(line, false);
                        }
                    }
                } while (!line.equals("q"));
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void printProducts() throws IOException {
        List<String> strings = this.fileIO.readFromFile(this.target);
        List<Product> products = new ArrayList<>();
        for(String s : strings) {
            products.add(this.main.chooser(s));
        }
        products.forEach(item -> System.out.println(item));
    }

    private void searchText(String string, boolean bl) throws IOException {
        List<String> strings = this.fileIO.findWordsInFile(string, this.target, bl);
        List<Product> products = new ArrayList<>();
        for (String s : strings) {
            Product product = this.main.chooser(s);
            products.add(product);
        }
        System.out.println();
        products.forEach(product -> System.out.println(product));
    }
}
