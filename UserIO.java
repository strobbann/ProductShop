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
    private String target;
    private FileIO fileIO;
    private Repository repository;

    public UserIO(Repository repository, FileIO fileIO, String target) {
        this.repository = repository;
        this.fileIO = fileIO;
        this.target = target;
    }

    public void readFromUser() {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
                String line;
                do {
                    System.out.println("1: To Create\n"+
                                        "2: SearchClass\n" +
                                        "3: SearchText\n" +
                                        "4: To print\n" +                    
                                        "q: to quit\n");
                    switch (line = br.readLine()) {
                        case "1": {
                            System.out.println("Productno, Class, Productname, description, price, [size], [color]\n");
                            line = br.readLine();
                            this.fileIO.writeToFile(line, this.target);
                            break;
                        }
                        case "2": {
                            System.out.println("Class Of Products");
                            line = br.readLine();
                            repository.searchByClass(line);
                            break;
                        }

                        case "3": {
                            System.out.println("Text In Products");
                            line = br.readLine();
                            repository.searchByText(line);
                            break;
                        }

                        case "4": {
                            System.out.println("Products");
                            repository.print();
                            break;
                        }

                    }
                } while (!line.equals("q"));
            }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
