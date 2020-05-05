import java.io.*;

public class Methods implements Serializable{
    public static void serialize(File file, Serializable obj) throws Exception{
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(obj);
        oos.close();
    }

    public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
        InputStream inSt = new FileInputStream(file);
        ObjectInputStream objInSt = new ObjectInputStream(inSt);
        Serializable readObject = (Serializable) objInSt.readObject();
        objInSt.close();
        inSt.close();
        return readObject;
    }
}
