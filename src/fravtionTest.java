import javax.swing.*;

public class fravtionTest {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(10,20);

        int num1 = fraction1.getNumerator();
        int den1 = fraction1.getDenominator();
        int num2 = fraction2.getNumerator();
        int den2 = fraction2.getDenominator();
        Arithmetic arithmetic = new Arithmetic();//method object class.

        //method from the object class
        Arithmetic.getArithmetic(num1,num2,den1,den2);

    }

}
