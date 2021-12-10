
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Utils {

    private static String OS = System.getProperty("os.name", "unknown").toLowerCase(Locale.ROOT);

    public static boolean isWindows()
    {
        return OS.contains("win");
    }

    public static boolean isUnix()
    {
        return OS.contains("nux");
    }
    
    public static String readContentFromFile(String file) throws FileNotFoundException, IOException {
        String dir = System.getProperty("user.home");
        File newFile = new File(File.separator + file);
        String absolutePath = newFile.getAbsolutePath();
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(absolutePath))) {
            String line = reader.readLine();
            while (line != null) {
                content += line + "\n";
                line = reader.readLine();
            }
            return newFile.getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        try {
            System.out.println(readContentFromFile("D:/GitHub/baitapOasis/bt/bt2/test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
