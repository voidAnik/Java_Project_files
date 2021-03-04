package Q1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mugabe", "Zimbabwe");
        Person p2 = new Person("MaMa", "La La Land");
        p1.print();
        trip(p1, p2);
        p2.universeFriend(p1);
        p1.print();
        p2.print();
    }

    public static void trip(Person p1, Person p2) {
        Person atel1 = p1;
        Person atel2 = new Person("Momin", "Honolulu");
        p1 = atel2;
        p2.print();
        p2.name = atel2.name;
        p2.countryName = p1.countryName;
        p2.print();
    }
}

class Person {
    public String name;
    public String countryName;
    public Person uniF;

    public Person(String name, String countryName) {
        this.name = name;
        this.countryName = countryName;
    }

    public void print() {
        System.out.println(name + " " + countryName);
    }

    public void universeFriend(Person p) {
        uniF = p;
        uniF.countryName = "Uganda";
    }
}