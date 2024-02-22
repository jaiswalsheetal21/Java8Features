package FunctionalInterface;
import java.io.*;

class B implements Serializable
{
    int i;
    String s;


    public B(int i,String s)
    {
        this.i = i;
        this.s = s;
    }
}

public class SerializableInterface {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        B a = new B(20,"GeeksForGeeks");

        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        B b = (B)ois.readObject();

        System.out.println(b.i+" "+b.s);

        // closing streams
        oos.close();
        ois.close();
    }
}
