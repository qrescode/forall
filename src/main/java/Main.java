import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer.PCBuilder("i5").build();
        c.getC();
    }
}