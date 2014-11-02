import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;

public class MyPolynomial {

    double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename){
        Scanner in = null;
        try{
            in = new Scanner(new File(filename));
        } catch (FileNotFoundException e){
           e.printStackTrace();
        }

        int degree = in.nextInt();
        coeffs = new double[degree+1];
        for (int i = 0; i < coeffs.length; i++){
            coeffs[i] = in.nextDouble();
        }
    }

    public int getDegree(){
        return coeffs.length-1;
    }

    public String toString(){
        String result = "";
        for(int i = coeffs.length-1; i > -1; i--){
            if (i == 1){result += coeffs[i] + "x + ";}
            else if (i != 0){result += coeffs[i] + "x^" +i+" + ";}
            else {result += coeffs[i];}
        }
        return result;

    }

    public double evaluate(double x){
        double result = 0;
        for (double i:coeffs){
            result += x*i;
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial anotherPolynomial){

    }
}
