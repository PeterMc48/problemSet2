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


  /*  public int getAdd(int numerator,int denominator)
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
