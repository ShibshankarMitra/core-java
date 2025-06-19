package coding_problems.basics;


public class ComplexNumbers {
    private int real;
    private int imaginary;
    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getReal() {
        return real;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public int getImaginary() {
        return imaginary;
    }
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    @Override
    public String toString() {
        return real+"+"+imaginary+"i";
    }

    public ComplexNumbers add(ComplexNumbers other) {
        return new ComplexNumbers(this.real+other.real, this.imaginary+other.imaginary);
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(1,2);
        ComplexNumbers c2 = new ComplexNumbers(3,4);
        System.out.println(c1.equals(c2));
        System.out.println(c1.add(c2));
    }
}
