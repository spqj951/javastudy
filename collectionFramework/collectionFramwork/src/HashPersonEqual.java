import java.util.Objects;

class Person2{
    private String name;
    private int age;

    public Person2(String n, int a){
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        String n =((Person2)obj).name;
        int a =((Person2)obj).age;

        if(name.equals(n)&& age == a)
            return true;
        else return false;
    }
}

public class HashPersonEqual {
    public static void main(String[] args) {

    }
}
