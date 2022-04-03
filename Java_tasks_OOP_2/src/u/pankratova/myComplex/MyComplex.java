package u.pankratova.myComplex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;
    private final static double EPSILON = 0.00001;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }


    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "real + imag: " + "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return (Math.abs(this.real - 0.0) < EPSILON);
    }

    public boolean isImaginary() {
        return (Math.abs(this.imag - 0.0) < EPSILON);
    }

     @Override
    public boolean equals(MyComplex another) {
        if (this == another) return true;
        if (!(another instanceof MyComplex)) return false;
        MyComplex myComplex = another;
        return Double.compare(myComplex.real, real) == 0 && Double.compare(myComplex.imag, imag) == 0;
    }
    
     @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }


    public double magnitude() {
        return (Math.sqrt(this.real * this.real + this.imag * this.imag));
    }


    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(right.real + this.real, right.imag + this.imag);
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(getReal() - right.getReal(), getImag() - right.getImag());
    }


    public MyComplex multiply(MyComplex right) {
        real = real * right.getReal() - imag * right.getImag();
        imag = real * right.getImag() + imag * right.getReal();
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex divide(MyComplex right) {
        double real2 = right.getReal();
        double image2 = right.getImag();
        double newReal = (real * real2 + imag * image2) / (real2 * real2 + image2 * image2);
        double newImage = (imag * real2 - real * image2) / (real2 * real2 + image2 * image2);
        return new MyComplex(newReal, newImage);
    }
}
