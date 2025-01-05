package ExceptionHandling;

public class Main2 {

	public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.println("try");
        } 
      
        catch (RuntimeException ex)  //Since RuntimeException is the most immediate superClass of Arithmatic Exception will be executed
        { 
            System.out.println("Runtime Exception catch");
        }    
        
        catch (Exception ex1)
        {
            System.out.println("Exception catch");
        }

        finally 
        {
            System.out.println("Finally block");
        }
    } 
    public static void badMethod() 
    { 
    	throw new ArithmeticException(); 
    } 
    
}
