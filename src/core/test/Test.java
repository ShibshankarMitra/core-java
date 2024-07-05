package Core.test;

public class Test {

    public static void main(String args[]) {

        /*TOPIC---- String Concatination */
        System.out.println(100 + 100 + "Simplilearn");
        System.out.println(100 * 100 + "Simplilearn");

        System.out.println("E-Learning Company" + 100 * 100);
        System.out.println("E-Learning Company" + 100 + 100);

        /* TOPIC-----reversing a String using String buffer */

        String string = new String("abcgefgchj");
        String newstring = new StringBuffer(string).reverse().toString();
        System.out.println(newstring);

        /*----TOPIC: String class .equals() and == operator Immutable String*/

        String str1 = "Shankar";//This means str1 points to "shankar" in the String Constant pool
        String str2 = new String("Shankar"); //str2 is a new String instance points to "shankar" in the String constant pool
        //Not Same as String str2=str1; because of the new keyword.
        String str4 = "Shankar"; //Same as String str4=str1;

        System.out.println(str1 == str2);//returns false, coz str2 is new Object of String reference type.
        System.out.println(str1 == str4);//returns true
        System.out.println(str1.equals(str2));//returns true.

        //Bcoz the String.equals() method inside String class is overridden to check
        //If the sequence of character is matching or not.
        //Default implementation of Object.equals() is {return obj1==obj2;}
        /**equals method compares the hashcode to see if the objects refer to the same memory index
         * Compares this string to the specified {@code StringBuffer}.  The result
         * is {@code true} if and only if this {@code String} represents the same
         * sequence of characters as the specified {@code StringBuffer}. This method
         * synchronizes on the {@code StringBuffer}.*/

        System.out.println("str1 - " + str1.hashCode() + " str2 - " + str2.hashCode() + " str4 - " + str4.hashCode());//output: -576209606 and -576209606
        //hashcodes will be same since they point to the same "string" in the string constant pool
        Object obj = new Object();
        ///------Immutablity of String
        str1 = null;//str1 now point to nowhere
        System.out.println(str2);//points to same "Shankar" in Straing constant pool
        System.out.println(str1);//points to same "Shankar" in Straing constant pool

        //If we change the STring str1, it will create a new String in Constant pool and point to the same.
        //After some time the previous String will get garbage collected if no other String is referencing it.
        //but str2,str4 they point to the same "shankar" in String constant pool.


        //----Topic---Null Pointer exception Concept

        //String str3= null;//Gives Null Pointer exception. String object str3 has been initialized as Null
        String str3 = new String("");//Value is null but pointer is not. Does not give Null pointer exception.
        System.out.println(str3.toString());
        //System.out.println(str3.charAt(0));//Throws a null pointer exception not String index out of bounds exception.
        //System.out.println(str2.charAt(100));//throws StringIndexoutOfBounds exception


    }
}
