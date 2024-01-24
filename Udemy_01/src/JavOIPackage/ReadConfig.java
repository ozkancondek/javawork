package JavOIPackage;

import java.io.FileReader;
import java.util.Properties;

public class ReadConfig {
    public static void main(String[] args) {
        try {
            FileReader fReader = new FileReader("./src/files/config.txt");
            Properties prop = new Properties();
            prop.load(fReader);

            String name = prop.getProperty("name");
            String age = prop.getProperty("age");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
