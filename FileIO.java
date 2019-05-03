import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    private Repository repository;
    private String target;
    public FileIO(Repository repository,String target) {
        this.repository = repository;
        this.target = target;
        this.repository = repository;
    }


    public void readFromFile(String target) {
        try (BufferedReader br = new BufferedReader(new FileReader(target));){
            String line = null;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i = i == 0 ? 1 : 0;
                    continue;
                }
                repository.add(line);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeToFile(String text, String toTarget) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(toTarget, true))){
            br.write(text + "\n");
            repository.add(text);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
