import java.util.Comparator;

public class Student implements Comparable<Student>
{
    String name;
    String id;
    double cgpa;
    Student (){}
    Student (String n, String i, double c)
    {
        this.name = n;
        this.id = i;
        this.cgpa = c;
    }

    @Override
    public int compareTo(Student name)
    {
        return this.name.compareTo(name.name);
    }

    public static Comparator<Student> idCompare = new Comparator<Student>() {

        @Override
        public int compare(Student id1, Student id2) {
            return id1.id.compareTo(id2.id);
        }
    };
    public static Comparator<Student> cgpaCompare = new Comparator<Student>() {

        @Override
        public int compare(Student cgpa1, Student cgpa2) {
            return (int)(cgpa1.cgpa-cgpa2.cgpa);
        }
    };

}
