package collections;

import java.util.*;

public class Main {

	public static void main(String[] args) {


		                         /* LIST INTERFACE */
		
		List<String> list= new ArrayList<String>();
		List<String> list2= new LinkedList<String>();
		//Provides us with Add(), set(index , Element), and remove() for CRUD operations
		list.add("Shibu");
		list.add("Anal");
		list.add("Pronoy");
		list.add("Jyotirmoy");


        Set<String> set = new HashSet<String>(list);
        LinkedHashSet<String> lhs = new LinkedHashSet<>(list);
		
		System.out.println(list);
		//Provides us with Add(), and remove() for CRUD operations
		//there is no set(index, Element) method here as it is unordered Collection. 
		//However LinkedHashset was introduced in Java 1.4 to maintain some insertion order
		//If you add a duplicate Element the initial element is simply replaced 
		System.out.println(set);
		
		SortedSet<String> sortedset= new TreeSet<String>();//sorted naturally on entry of elements
		sortedset.addAll(list);
		//Elements must implement java.lang.Comparable.compareTo(Object) so that sorting is enabled
		System.out.println(sortedset);
		
		
		
		//calling list.iterator() to get iterator
		//its thread safe and locks the elements of the collection during iteration
		//modcount is a transient variable that iterator refers to understand the modifications made
		//while the whole cycle of iteration if it finds that modcount is changed , that is an inconsistency
		//if any inconsistency found it will throw ConcurrentModificationException.
		Iterator<String> iterator = list.iterator();
		while (  iterator.hasNext())
		{
			System.out.println(iterator.next());//iterator.next() reads the value while iterator.remove() removes.
			//So while using iterator we can perform show and delete
			
			
			//list.add("Mainak");//Exception in thread "main" java.util.ConcurrentModificationException
			//But if we try to Add or update then it Throws ConcurrentModificationException
			
		}
		
		
		ListIterator<String> li =list.listIterator();
		//li.add("Raja");

		System.out.println(list);
		System.out.println(li.previousIndex());// ListIterator cyrrently at -1, prints the currentIndex
		System.out.println(li.nextIndex());// ListIterator cyrrently at -1, Zero is the nextIndex, prints 0
		
		System.out.println(li.next());//li moves to the next Index that is 0. And prints 0th index element.
		System.out.println(li.next());//li moves to next index that is 1. And prints 1st index element
		li.set("Harini");//li currently at index 1, so it updates the element at index 1
		
		System.out.println("Current index = "+ li.previousIndex());//li currently at index 1, so it prints CurrentIndex 1
		System.out.println(li.nextIndex());//li currently at index 1, so it prints 2
		
		System.out.println("Current index value = "+li.previous());
		
		//Support updating while iterating, Apart from next() for Read
		//And remove() for Delete, it gives us set() for updating the List while iterating.
		System.out.println(list);
		
		
		//System.out.println(li.previous());
		
		
		
		HashMap<String, Integer> map= new HashMap<>();
		map.put("shibu", 1000);
		map.put("Aanal", 1000);
		map.put("shibu", 1002);
		map.put("ssm", 1003);
		map.put("hasan", 1005);
		System.out.println(map);
		//Key has to be unique, can't be duplicate.
		//If Duplicate found then does not give a complie time error but replaces the value for the key
		
		//map.put(null, 1003);
		//you can have only one null value in map
		
		TreeMap<String, Integer> tmap= new TreeMap<>(map);//Will throw runtime exception
		//since map has a null key
		//msg- Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
		//any sorted collection will not allow any null values.
		
		
		
		
		
		System.out.println(tmap);
		
		Set<String> set1= new HashSet<String>();
		set1.add("Shibu5");
		set1.add("Shibu1");
		set1.add("Shibu2");
		set1.add("Shibu0");
		
		TreeSet<String> tset= new TreeSet<>(set1);
		
		System.out.println(tset);
		System.out.println(set1);
		
		
		
		//to Convert any Collection to Threadsafe/ Synchronized we can Call Collections.synchronizedList(null)/Set/map
		//Or we can use Cuncurrent Collections which allows multithreading but acheives thread safety by Lock Stripping
		//ex - java.util.concurrent.CopyOnWriteArrayList<E> / CopyOnWriteArraySet<E>/ ConcurrentHashMap<K, V>

	}

}
