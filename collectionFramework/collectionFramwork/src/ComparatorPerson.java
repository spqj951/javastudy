import java.util.Comparator;
import java.util.TreeSet;

class Person3 implements Comparable<Person3>{
    String name;
    int age;

    public Person3(String n, int a){
        name = n;
        age  = a;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Person3 o) {
        return o.age - age;
    }
}
class PersonComparator implements Comparator<Person3>{

    @Override
    public int compare(Person3 o1, Person3 o2){
        return o2.age - o1.age;
    }
}

public class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<Person3> tree = new TreeSet<>();
        tree.add(new Person3("YOON", 37));
        tree.add(new Person3("HONG", 53));
        tree.add(new Person3("PARK", 22));

        for(Person3 p : tree){
            System.out.println(p);
        }
    }
}
