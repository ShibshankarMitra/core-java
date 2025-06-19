package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CMException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>(list);
        cowList.add(7);
        cowList.add(8);
        cowList.add(9);
        cowList.add(10);

        Iterator<Integer> iterator = list.iterator();
        //this is a fail-fast iterator
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println("Current Value: " + value);
            if(value == 2) {
                iterator.remove();//this is allowed in fail-fast iterator for removal during operation
                list.remove(value);// this will throw ConcurrentModificationException
            }
        }
        System.out.println("List after removal: " + list);

        Iterator<Integer> iteratorSafe = cowList.iterator();
        //this is a fail-safe iterator
        while(iteratorSafe.hasNext()){
            Integer value = iteratorSafe.next();
            System.out.println("Current Value: " + value);
            if(value == 2) {
                //iteratorSafe.remove();//this is throw UnsupportedOperationException in fail-safe iterator
                cowList.remove(value);// this will not throw ConcurrentModificationException, It is safe to remove in fail-safe iterator
            }
        }
        System.out.println("List after removal: " + cowList);
    }
}
