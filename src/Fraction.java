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
        numerator = 0;
        denominator=0;
    }
    public Fraction(int numerator,int denominator)
    {
        setDenominator(denominator);
        setNumerator(numerator);
    }
    public int getAdd(int numerator,int denominator)
    {
        return numerator + denominator;
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

    public String toString() {



    }
}
