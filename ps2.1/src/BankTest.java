import javax.swing.*;
import java.awt.*;

public class BankTest {
    public static void main(String[] args) {
        JTextArea textArea =new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);
        Person accountHolder;
        BankAccount[] bankAccount = new BankAccount[2];

        String text="nothing";
      /*  for(Person p: accountHolder) {
            //String accountNum1 = JOptionPane.showInputDialog("Enter Account number here");
            //double balance1 = Double.parseDouble(JOptionPane.showInputDialog("enter Balance here"));
            //String accHolder = JOptionPane.showInputDialog("Enter Account holders name here");
            p = new Person(JOptionPane.showInputDialog("Enter name there"));
        }*/
        String accountNum1;
        double balance1;

     for (int i=0;i<bankAccount.length;i++) {

           {
               accountNum1 = JOptionPane.showInputDialog("Enter Account number here");
               balance1 = Double.parseDouble(JOptionPane.showInputDialog("enter Balance here"));
               accountHolder = new Person(JOptionPane.showInputDialog("Enter name there"));
               bankAccount[i] = new BankAccount(accountNum1,balance1,accountHolder);
           }
     }

        for(BankAccount bank: bankAccount)
        {
            text += bank.toString() + "\n";
            textArea.append(text);
        }



        JOptionPane.showMessageDialog(null,text);

    }
}
