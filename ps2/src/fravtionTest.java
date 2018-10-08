import javax.swing.*;
import java.awt.*;

public class fravtionTest {

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN,12);
        textArea.setFont(font);

        Fraction fractionPlus;
        Fraction fractionMinus;
        Fraction fractionMulti;
        Fraction fractionDiv;
        Fraction fraction2 = new Fraction(10,20);
        Fraction fraction3 = new Fraction(1, 4);



        fractionPlus = fraction2.addFractions(fraction2,fraction3);
        fractionMinus = fraction2.minusFraction(fraction3);
        fractionMulti = fraction2.multiFraction(fraction3);
        fractionDiv = fraction2.divFraction(fraction3);

        String text = fractionPlus.toString() + "\n"+fractionMinus.toString()+ "\n"+fractionMulti.toString()+"\n"+fractionDiv.toString();

        textArea.append(text);

        JOptionPane.showMessageDialog(null,text);


    }

}
