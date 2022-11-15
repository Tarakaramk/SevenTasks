import java.util.ArrayList;
import java.util.Iterator;
public class EvenIterator {
    public void numberIterator(){
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                numbers.add(12);
                numbers.add(8);
                numbers.add(2);
                numbers.add(23);
                numbers.add(4);
                numbers.add(1);
                numbers.add(3);
                numbers.add(5);
                numbers.add(6);
                numbers.add(7);
                Iterator<Integer> it = numbers.iterator();
                while(it.hasNext()) {
                    Integer i = it.next();
                    if(i % 2==0) {
                        System.out.println(i);
                    }
                }
            }
        }
