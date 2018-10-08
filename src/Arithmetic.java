import javax.swing.*;

public class Arithmetic {
    public static String getArithmetic(int num1,int num2,int den1,int den2) {
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
