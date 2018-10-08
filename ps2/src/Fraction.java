import javax.swing.*;

public class Fraction {
    private int numerator;
    private int denominator;


    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public Fraction(){
        numerator = 15;
        denominator=25;
    }
    public Fraction(int numerator,int denominator)
    {
        setDenominator(denominator);
        setNumerator(numerator);
    }

    public String toString(){
        return getNumerator()+" / "+getDenominator();
    }
   public Fraction addFractions(Fraction f){
        int totalNum,totalDen;
        Fraction fAns;
        totalNum = this.getNumerator() * f.getDenominator() + f.getNumerator() * this.getDenominator();
        totalDen = f.getDenominator() *this.getDenominator();
        fAns = new Fraction(totalNum,totalDen);
        return fAns;
    }


    public static Fraction addFractions(Fraction f1,Fraction f2){
        int totalNum,totalDen;
        Fraction fAns;
        totalNum = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();
        totalDen = f2.getDenominator() *f1.getDenominator();
        fAns = new Fraction(totalNum,totalDen);
        return fAns;

    }
    public Fraction minusFraction(Fraction f){
        Fraction fAns;
        int totalNum = this.getNumerator() * f.getDenominator() - f.getNumerator() * this.getDenominator();
        int totalDen = this.getDenominator() * f.getDenominator();
        fAns = new Fraction(totalNum,totalDen);
        return fAns;
    }
    public Fraction multiFraction(Fraction f){
        Fraction fAns;
        int totalNum = this.getNumerator() * f.getNumerator();
        int totalDen = this.getDenominator() * f.getDenominator();
        fAns = new Fraction(totalNum,totalDen);
        return fAns;
    }
    public Fraction divFraction(Fraction f){
        Fraction fAns;
        int totalNum = this.getNumerator() * f.getDenominator();
        int totalDen = this.getDenominator() * f.getNumerator();
        fAns = new Fraction(totalNum,totalDen);
        return fAns;
    }




    /*public static String getArithmetic(int num1,int num2,int den1,int den2) {
        int  totalNum, totalDen;
        String choice = JOptionPane.showInputDialog("Please enter the arithmetis you wish to use( + - * /)");
        switch (choice) {
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
   public int getAdd(int numerator,int denominator)
    {
        return (numerator/denominator) + (numerator/denominator);
    }
    public int getSubtract(int numerator,int denominator){
        return numerator - denominator;
    }
    public int getMultiply(int numerator,int denominator){
        return numerator * denominator;
    }
    public int getDivide(int numerator, int denominator){
        return numerator / denominator;
    }
    public char getSwitch(int numerator,int denominator) {
        char choose=0;
        switch (choose) {
            case 1:
                getAdd(numerator, denominator);
                break;
            case 2:
                getSubtract(numerator,denominator);
                break;
            case 3:
                getMultiply(numerator,denominator);
                break;
            case 4:
                getDivide(numerator,denominator);
                default:
                    System.out.println("No algorithm");
                    break;
        }
        return choose;
    }*/

}
