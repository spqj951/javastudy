import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class ConversionCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list); //인스턴스를 복사

        for(Iterator<String> itr = list.iterator(); itr.hasNext();){
            System.out.print(itr.next() + '\t');

        }
        System.out.println();

        list = new LinkedList<>(list);

        for(Iterator<String> itr =list.iterator(); itr.hasNext();){
            System.out.print(itr.next() + '\t');
        }
        System.out.println();


    }
}
