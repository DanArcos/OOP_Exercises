//This test the implementation of a polynomial object
public class TestMyPolynomial {
    public static void main (String[] args){
        //Triple dots reflect an array of any size can be made when invoked
        MyPolynomial p1 = new MyPolynomial(1.1,2.2,3.3);
        MyPolynomial p2 = new MyPolynomial(1.1,2.2,3.3,4.4);

        double[] coeffs = {1.1,2.2,3.3};
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println(p3);
        System.out.println(p3.evaluate(1.567));
    }
}
