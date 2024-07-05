package ExceptionHandling;

public class Main4 {

	public static void main(String args[]) {
		System.out.println(Main4.m1());
	}
	@SuppressWarnings("finally")
	public static int m1() {
		try {
			return 0/0;
		}
		
		catch (Exception e) {
			return 1;
		}
		
		finally {
			return 2;
		}
		
	}
}
