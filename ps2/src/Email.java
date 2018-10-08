import javax.swing.*;

public class Email {
    public static void main(String[] args) {
        Message m = new Message();

        m.setRecipient(getRecipient());
        m.setSender(getSender());
        m.setText(append());

        JOptionPane.showMessageDialog(null, m);

    }
    public static String getRecipient(){
        String r = JOptionPane.showInputDialog("Recipient: ");
        return r;
    }
    public static String getSender(){
        return JOptionPane.showInputDialog("Sender:");
    }
    public static String append(){
        return JOptionPane.showInputDialog("Message");
    }

}
