package generics;

public class Main {
	public static void main(String[] args) {
		Printer<Integer> intPrinter= new Printer<>(100);
		Printer<Double> doublePrinter= new Printer<>(10.024531);
		intPrinter.print();
		doublePrinter.print();

		shout(100, "SSM");
	}

	private static <K,V> void shout(K k, V v){
		System.out.println(k.toString()+"!!!");
		System.out.println(v.toString()+"!!!");
	}
}
