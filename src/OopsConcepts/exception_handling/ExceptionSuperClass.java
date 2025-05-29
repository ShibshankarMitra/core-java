package OopsConcepts.exception_handling;

public class ExceptionSuperClass {

    public static void main(String[] args) {
        //The most immediate super class of the thrown exception class will be caught
        //here in this case it will be ArithmeticException
        try {
            badMethod();
            System.out.println("try");
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticException Exception catch");
        } catch (RuntimeException ex1) {
            System.out.println("Runtime Exception catch");
        } catch (Exception ex2) {
            System.out.println("Exception catch");
        } finally {
            System.out.println("Finally block");
        }
    }
    public static void badMethod() {
        throw new ArithmeticException();
    }

}
