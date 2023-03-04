import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorCollection {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");
        list.add("Box");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + '\t');
        }
        System.out.println();

        itr = list.iterator();

        String str;
        while (itr.hasNext()) {
            str = itr.next();
            if (str.equals("Box"))
                itr.remove();
        }

        for(itr =  list.iterator(); itr.hasNext();){//초기화시킨다면 Iterator  itr
            System.out.print(itr.next()+'\t');
        }

    }
}
