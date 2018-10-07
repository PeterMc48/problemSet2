import javax.swing.*;

public class fravtionTest {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(10,20);

        int num1 = fraction1.getNumerator();
        int den1 = fraction1.getDenominator();
        int num2 = fraction2.getNumerator();
        int den2 = fraction2.getDenominator();

        fraction1.setNumerator(num1);
        fraction1.setDenominator(den1);
        fraction2.setNumerator(num2);
        fraction2.setDenominator(den2);

        getArithmeetic(num1,num2,den1,den2);

    }
    public static String getArithmeetic(int num1,int num2,int den1,int den2) {
        int  totalNum, totalDen;
        String choice = JOptionPane.showInputDialog("Please enter the arithmetis you wish to use( + - * /)");
        switch (choice) {
            case "+":
                totalNum = num1 * den2 + num2 * den1;
                totalDen = den1 *den2;
                JOptionPane.showMessageDialog(null,num1+"/"+den1+" + "+
                        num2+"/"+den2+ " is "+totalNum+"/"+totalDen);
                break;
            case "-":
                totalNum = num1 * den2 - num2 * den1;
                totalDen = den1 *den2;
                JOptionPane.showMessageDialog(null,num1+"/"+den1+" - "+
                        num2+"/"+den2+ " is "+totalNum+"/"+totalDen);
                break;
            case "*":
                totalNum = num1 *  num2;
                totalDen = den1 *den2;
                JOptionPane.showMessageDialog(null,num1+"/"+den1+" * "+
                        num2+"/"+den2+ " is "+totalNum+"/"+totalDen);
                break;
            case "/":
                totalNum = num1 * den2;
                totalDen = den1 *num2;
                JOptionPane.showMessageDialog(null,num1+"/"+den1+" / "+
                        num2+"/"+den2+ " is "+totalNum+"/"+totalDen);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"no arithmetic choosen");
        }
        return choice;
    }
}
