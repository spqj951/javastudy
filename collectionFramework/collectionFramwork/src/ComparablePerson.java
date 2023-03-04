import java.util.TreeSet;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String n, int a){
        name =  n;
        age = a;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}

public class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));

        for(Person p : tree)
            System.out.println(p);
    }
}
