import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;

public class ObjectIO<T extends Serializable>  {

    private String target;

    public ObjectIO(String target) {
        this.target = target;
    }

    public void writeObject(T t) {
        try(FileOutputStream fileOut = new FileOutputStream(target);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);){
            out.writeObject(t);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Serializable> T readObject(String target){
        T t = null;
        try(FileInputStream fileIn = new FileInputStream(target);
            ObjectInputStream in = new ObjectInputStream(fileIn);){
                t = (T) in.readObject();
                return t;

        }catch(IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return t;
    }

}
