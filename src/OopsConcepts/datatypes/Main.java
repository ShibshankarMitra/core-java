package OopsConcepts.datatypes;

public class Main {

    public static void main(String[] args) {
        //By default initiated as false
        boolean[] barr = new boolean[5];
        for (boolean bool : barr)
            System.out.println(bool);//By default initiated as false in Array types
        //float f= 1.02589222;//type mismatch, any decimal is taken by default as Double not float
        //So you have to type cast it to float from double
        float f = (float) 1.02589222;
        //or you can use f appended
        float f1 = 1.02589223f;
        float[] farr = new float[5];
        for (float flt : farr)
            System.out.println(flt);
        //By default initiated as 0.0f
        double d = 1.2500259666;
        double[] darr = new double[5];
        for (double dob : darr)
            System.out.println(dob);
        //By default initiated as 0.0
        double sum = f + d;
        System.out.println(sum);
    }
}
