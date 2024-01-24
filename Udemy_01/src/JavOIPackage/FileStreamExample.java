package JavOIPackage;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream myStream = new FileInputStream("./src/files/ozkan.txt");
            int i = myStream.read(null);
            while (i != -1) {
                System.err.print((char) i);
            }
            myStream.close();
        } finally {
        }

    }

}