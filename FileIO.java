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

    public List<String> readFromFile(String target) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(target));){
            String line = null;
            boolean firstTime = true;
            while ((line = br.readLine()) != null) {
                if (firstTime) {
                    firstTime = !firstTime;
                } else {
                    strings.add(line);
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return strings;
    }

    public void writeToFile(String text, String toTarget) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(toTarget, true))){
            br.write(text + "\n");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<String> findWordsInFile(String searchWord, String target, boolean searchClass) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(target))){
            String line = null;
            boolean firstTime = true;
            while ((line = br.readLine()) != null) {
                if(firstTime){
                    firstTime = !firstTime;
                }else{
                    if (searchClass) {
                        String className = StringHandler.getStringFromArrayTrimmed(1, line);
                        if(className.equals(searchWord)){
                            strings.add(line);
                        }
                    } else if(line.toLowerCase().contains(searchWord.toLowerCase())){
                        strings.add(line);
                    }
                }
            }
            return strings;
        }
        catch (IOException ex) {
            ex.printStackTrace();

        }
        return strings;
    }
}
