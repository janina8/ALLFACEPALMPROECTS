
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("LuciferInStarlight.mp3"));
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("CopyLuciferInStarlight.mp3"))) {

            int value;
            while ((value = bin.read()) != -1) {
                bout.write(value);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            System.out.println("io problems");

        }

    }
}
