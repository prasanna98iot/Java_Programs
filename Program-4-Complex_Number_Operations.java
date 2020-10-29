public class ComplexNumber {
    // write your code here
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal()
    {
        return this.real;
    }
    public double getImaginary()
    {
        return this.imaginary;
    }
    public void add(double real, double imaginary)
    {
        this.real = real + this.real;
        this.imaginary = imaginary + this.imaginary;
    }
    public void subtract(double real, double imaginary)
    {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
    //Type Object
    public void add(ComplexNumber complex)
    {
        this.real = complex.getReal() + this.real;
        this.imaginary = complex.getImaginary() + this.imaginary;
    }
    public void subtract(ComplexNumber complex)
    {
        this.real = this.real - complex.getReal() ;
        this.imaginary = this.imaginary - complex.getImaginary();
    }
}

/*
Test Code:
// Write it as Main Class and Execute it for testing the above class.
ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber number = new ComplexNumber(2.5, -1.5);
one.add(1,1);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
one.subtract(number);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
number.subtract(one);
System.out.println("number.real= " + number.getReal());
System.out.println("number.imaginary= " + number.getImaginary());

→ OUTPUT

one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0 */