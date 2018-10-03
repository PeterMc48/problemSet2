import javax.swing.*;
import java.awt.*;

public class BicycleDriver {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        JTextArea textArea = new JTextArea();
        Font font = new Font("Monospace",Font.PLAIN,12);
        textArea.setFont(font);



        bike1.setOwner(getName());
        double value1 = getValue();
        bike1.setValue(getIncreaseValue(value1));
        bike1.setMake(getMake());



        bike2.setOwner(getName());
        double value2 = getValue();
        bike2.setValue(value2);
        bike2.setMake(getMake());



        double total = getTotal(value1,value2);



        String text = "Bike Details\n------------\n"+bike1+"\n"+bike2+
                "\n Total value of both bikes: ;"+total;

        textArea.append(text);

        JOptionPane.showMessageDialog(null,text);


    }
    public static String getName(){
        String name =JOptionPane.showInputDialog("Owners Name:");
        return name;
    }
    public static double getValue(){
        return Double.parseDouble(JOptionPane.showInputDialog("Value of the bike:"));
    }
    public static String getMake()
    {
        return JOptionPane.showInputDialog("Make of the bike:");
    }
    public static double getIncreaseValue(double v)
    {
        return v + 10.00;
    }
    public static double getTotal(double v1,double v2)
    {
        return v1+v2;
    }
}
