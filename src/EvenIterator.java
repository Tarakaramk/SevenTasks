import java.util.Arrays;
import java.util.Iterator;

public class EvenIterator {
    public void numberIterator() {
        Integer[] numbers = {12, 8, 2, 23, 4, 1, 3, 5, 6, 7};
        Iterator<Integer> iterator = Arrays.asList(numbers).iterator();

        int newnum=0;
        while(iterator.hasNext()) {
            newnum=iterator.next();
            if (newnum % 2 == 0) {
                System.out.println(newnum);
            }
        }
    }
}
