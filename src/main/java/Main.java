import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Computer c = new PCBilder("i9").setRam(1024).build();
        c.getC();
    }
}