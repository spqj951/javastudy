import java.util.Comparator;
import java.util.TreeSet;

class IntegerComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return b-a;
    }

}
public class ComparatorInteger {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(new IntegerComparator());
        tree.add(30);
        tree.add(10);
        tree.add(20);
        System.out.println(tree);
    }
}
