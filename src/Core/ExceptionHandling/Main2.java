package ExceptionHandling;

public class Main2 {

	public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A");  
        } 
      
        catch (Exception ex)  //Since Exception is the superClass of all 
        //it will handle Runtime Exception
        { 
            System.out.print("C"); 
        }    
        
//        catch (ArithmeticException ex1)
//        { 
//            System.out.print("B"); 
//        } 
        
        finally 
        {
            System.out.print("D"); 
        } 
        System.out.print("E"); 
    } 
    public static void badMethod() 
    { 
    	throw new ArithmeticException(); 
    } 
    
}
