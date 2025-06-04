package oops_concepts.exception_handling;

public class MultipleExceptions {
    //non-static, belongs to Objects or Instances
    public static void main(String[] args) throws Exception {
        try {
            String str = null;
            int result = 0 / 0;
        } catch (NullPointerException | ArithmeticException e) {//runs in case the code throws exception
            System.out.println("An Null pointer Error has Occured");
        } finally //executes regardless of the result
        {
            System.out.println("Finally executing ");
        }
        //Both catch and finally are optional, but you must use one of them.
		//Even we can skip catch or finally itself for try with resources
        //If no catch block is present then control goes to finally block then at last exception is printed
        //But if there is a Catch block present then catch will be executed before finally
    }

}
