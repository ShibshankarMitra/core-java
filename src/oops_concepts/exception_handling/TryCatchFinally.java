package oops_concepts.exception_handling;

public class TryCatchFinally {

    public static void main(String[] args) {
        System.out.println(TryCatchFinally.m1());
    }

    public static int m1() {
		int x= 0;
		try{
			x=1;
			return x;
		}
		finally {
			x=2;
			//return x;
		}
    }
}
