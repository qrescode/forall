import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Computer c = new PCBilder().setCpu("i9").build();
        c.getC();
    }
}