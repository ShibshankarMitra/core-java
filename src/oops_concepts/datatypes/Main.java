package oops_concepts.datatypes;

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

        //for primitives == operator will compare the actual values
        //and for reference types the == operator will compare te object reference
        // to compare the Object contents we will use equals() method
        int i=100;
        int j=100;
        System.out.println(i==j);//will print true

        Integer i1=100;
        Integer i2=100;
        System.out.println(i1==i2);//will print true
        System.out.println(i1.equals(i2));//will also print true
        //even though they are reference types for Integer types -128 to 127 values are cached in jvm memory
        //hence we get the same reference for different objects
        //However if we take Integer values beyond this range we will get anomaly in == and equals() comparison

        Integer i3=200;
        Integer i4=200;
        System.out.println(i3==i4);//will print true
        System.out.println(i3.equals(i4));//will also print true
    }
}
