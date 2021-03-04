import java.util.ArrayList;
import java.util.Collections;

public class FileAssignment {
    public static void main (String []args)
    {
        ArrayList<Windows> windowList = new ArrayList<>();
        FileWindow windowsFile = new FileWindow();
        windowsFile.read(windowList);
        Collections.sort(windowList);
        windowsFile.write(windowList);
    }
}
