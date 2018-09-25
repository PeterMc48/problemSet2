public class Book {
    //attributes must be in globel
    String title,ISBN;
    float price;
    int numOfPages;
// get the attributes
    public String getTitle()

    {
        return title;
    }
//set the attributes
    public void setTitle(String title)

    {
        this.title = title;
    }
    public String getISBN()

    {
        return ISBN;
    }

    public void setISBN(String ISBN)

    {
        this.ISBN = ISBN;
    }
    public float getPrice()

    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }
    public int getNumOfPages()

    {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages)
    {
        this.numOfPages = numOfPages;
    }

    public Book()//constructor
    {
        title = "No title";
        price = 0.00f;
        ISBN = "No Isbn";
        numOfPages = 0;

    }
//to output the attributes in the main method
    public String toString()
    {
        return "Title: " + title + "\nISBN: " + ISBN + "\nPrice: " + price + "\nNumber of Pages: "+numOfPages;
    }

}
