import javax.swing.*;
import java.awt.*;

public class FirstBook {
    public static void main(String[] args) {
        Book fav = new Book();
        JTextArea textArea = new JTextArea(30, 10);
        Font font = new Font("Monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        fav.setTitle(getfavBook());
        fav.setPrice(getPrice());
        fav.setISBN(getISBN());
        fav.setNumOfPages(getPage());

        Book leastFav = new Book();

        leastFav.setTitle(getleastFavBook());
        leastFav.setPrice(getPrice());
        leastFav.setISBN(getISBN());
        leastFav.setNumOfPages(getPage());

        String text = "Your favourite book is:\n------------\n"+
                fav+ "\n\nYour least favourite book is:\n------------\n"+ leastFav;

        textArea.append(text);

        JOptionPane.showMessageDialog(null,text);
    }
    public static String getfavBook()
    {
        String favBook = JOptionPane.showInputDialog("What is the title of your Favourite book? ");

        return favBook;
    }
    public static String getleastFavBook()
    {
        String leastFavBook = JOptionPane.showInputDialog("What is the title of your least Favourite book? ");

        return leastFavBook;
    }
    public static float getPrice()
    {
        String priceAsString = JOptionPane.showInputDialog("How much is the book?");
        float price = Float.parseFloat(priceAsString);
        return price;
    }
    public static String getISBN()
    {
        String ISBN = JOptionPane.showInputDialog("Please enter the ISBN:");
        while(ISBN.length() != 10 && ISBN.length() != 13)
        {
            ISBN = JOptionPane.showInputDialog("Invalid! ISBN must be 10 or 13 characters long, Please re-enter the ISBN:");
        }

        return ISBN;
    }
    public static int getPage()
    {
        String pageAsString = JOptionPane.showInputDialog("Please enter the number of pages in the book");
        for(int i =0;i<pageAsString.length();i++)
        {

            while(!Character.isDigit(pageAsString.charAt(i)))
            {
                pageAsString = JOptionPane.showInputDialog("Invalid! Please enter a digit");
            }
        }

        int page = Integer.parseInt(pageAsString);
        return page;

    }
}
