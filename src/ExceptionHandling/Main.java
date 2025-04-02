package ExceptionHandling;

public class Main {

	int i=0;
	//non-static, belongs to Objects or Instances
	public static void main(String[] args) throws Exception {
		try 
        {
            //System.out.print("Hello world ");
            
            //int result= i/i;// calling non-Static varriables with out creating instances
            //Throws compile time Error
            String str= null;
            
            //System.out.println(str.equals(""));
            int result=0/0;
            
            //System.out.println(result);
            
        }
		
		 catch (NullPointerException e) {//runs in case the code throws exception
		 e.printStackTrace();//returns void, prints the error msg at the last
		 System.out.println("An Null pointer Error has Occured"); 
		 }
		 
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("An Arithmatic Error has Occured"); 
		}
		
        finally //executes regardless of the result
        {
            System.out.println("Finally executing ");
        }
		
		
		//Both catch and finally are optional, but you must use one of them.
		//If no catch block is present then control goes to finally block then at last exception is printed
		//But if there is a Catch block present then catch will be executed before finally and 
		//the exception will b printed from within the catch block
	}

}
