import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWindow {
    Scanner input;
    PrintWriter writeFile;

    public void read(ArrayList<Windows> windowList) {
        try {
            input = new Scanner(new File("src/WindowsInfo.txt"));

        } catch (Exception e) {
            System.out.println("File not found for reading!");
        }

        while (input.hasNext()) {
            Windows tempWindow = new Windows();
            tempWindow.glass.name = input.next();
            tempWindow.glass.weight = Double.parseDouble(input.next());
            tempWindow.size = Integer.parseInt(input.next());
            windowList.add(tempWindow);
        }
        input.close();
    }
    public void write(ArrayList<Windows> windowList)
    {
        //FileWriter fw = new FileWriter("res/StudentsInfo.txt");
        try {
            writeFile = new PrintWriter("src/SortedWindowsInfo.txt");
        }catch(IOException ex)
        {
            System.out.println("File not found for writing!");
        }
        for(int i=0;i<windowList.size();i++) {
            writeFile.println(windowList.get(i).glass.name+ "\n" + windowList.get(i).glass.weight + "\n"
                    + windowList.get(i).size );
        }
        writeFile.close();
    }
}
