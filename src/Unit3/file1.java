package Unit3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class file1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\MSII\\OneDrive\\Desktop\\AI-A\\src\\Unit3\\db.Properties");
        Properties p=new Properties();
        p.load(fr);
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("admin"));
    }
}
