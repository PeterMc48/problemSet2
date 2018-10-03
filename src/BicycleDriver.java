import javax.swing.*;

public class BicycleDriver {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();



        bike1.setOwner(getName());
        bike1.setValue(getValue());
        bike1.setMake(getValue());

        JOptionPane.showMessageDialog(bike1.toString());
    }
    public static String getName(){
        return JOptionPane.showInputDialog("Owners Name:");
    }
    public static double getValue(){
        return Double.parseDouble(JOptionPane.showInputDialog("Value of the bike:"));
    }
    public static String getMake(){
        return JOptionPane.showInputDialog("Make of the bike:");
    }
}
