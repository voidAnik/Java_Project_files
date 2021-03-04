import java.io.*;
import java.util.*;

public class FileWork {
    Scanner input;
    PrintWriter writeFile;
    public void read(ArrayList<Student> students) {
        try {
            input = new Scanner(new File("res/StudentInfo.txt"));

        } catch (Exception e) {
            System.out.println("File not found for reading!");
        }
        while (input.hasNext()) {
            Student tempStudent = new Student();
            tempStudent.name = input.next();
            tempStudent.id = input.next();
            tempStudent.cgpa = Double.parseDouble(input.next());
            students.add(tempStudent);
        }
        input.close();
    }
    public void write(ArrayList<Student> students)
    {
        //FileWriter fw = new FileWriter("res/StudentsInfo.txt");
        try {
             writeFile = new PrintWriter("res/StudentInfo.txt");
        }catch(IOException ex)
        {
            System.out.println("File not found for writing!");
        }
        for(int i=0;i<students.size();i++) {
            writeFile.println(students.get(i).name + " " + students.get(i).id + " " + students.get(i).cgpa);
            //System.out.println(students.get(i).name + " " + students.get(i).id + " " + students.get(i).cgpa);
        }
        writeFile.close();
    }
}
