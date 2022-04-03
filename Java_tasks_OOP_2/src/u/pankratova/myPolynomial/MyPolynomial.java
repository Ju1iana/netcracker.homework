package u.pankratova.myPolynomial;

public class MyPolynomial {
    private final double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        int endIndex = this.coeffs.length;
        for (int i = this.coeffs.length - 1; i > 0; i--) {
            if (this.coeffs[i] == 0) {
                continue;
            } else {
                endIndex = i;
                return endIndex + 1;
            }
        }
        return endIndex;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public String toString() {
        String spacing = "";
        for (int i = this.getDegree() - 1; i >= 0; i--) {


            if (this.coeffs[i] == 1) {
                if (i == 1) {
                    spacing += ("x" + " + ");
                } else if (i == 0) {
                    spacing += "1";
                } else {
                    spacing += ("x^" + i + " + ");
                }


            } else {
                if (i == 1) {
                    spacing += (this.coeffs[i] + "x" + " + ");
                } else if (i == 0) {
                    spacing += (this.coeffs[i]);
                } else {
                    spacing += (this.coeffs[i] + "x^" + i + " + ");
                }
            }
        }
        return spacing;
    }

    public double evaluate(double x) {
        double result = 0;

        for (int i = 0; i < this.getDegree(); i++) {
            result += (this.coeffs[i] * Math.pow(x, i));
            if (this.getDegree() == 1) {
                result += this.coeffs[i];
            }
        }
        return result;
    }


    public MyPolynomial multiply(MyPolynomial right) {
        double[] coeffs = new double[this.getDegree() + right.getDegree()];
        MyPolynomial newPolynomial = new MyPolynomial(coeffs);
        for (int i = 0; i < this.getDegree(); i++) {
            for (int j = 0; j < right.getDegree(); j++) {
                newPolynomial.coeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return newPolynomial;
    }

    public MyPolynomial add (MyPolynomial right) {

        MyPolynomial left = this;

        if (left.getDegree() < right.getDegree()){
            left = right;
            right = this;
        }

        double[] leftCoeffs = left.getCoeffs();
        double[] rightCoeffs = right.getCoeffs();

        for (int i = 0; i < left.getDegree(); i++) {
            if (i > rightCoeffs.length - 1){
                continue;
            }
            leftCoeffs[i] = leftCoeffs[i] + rightCoeffs[i];
        }
        return new MyPolynomial(leftCoeffs);
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
    

}
