import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try(InputStream in = new FileInputStream("db.txt")){
            int b;
            while ((b = in.read()) != -1){
                System.out.println((char)b);
                //fff
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}