public class Bicycle {
    private String owner;
    private double value;
    private String make;

    public String getOwner()
    {
        return owner;
    }
    public void setOwner()
    {
        this.owner=owner;
    }
    public double getValue()
    {
        return value;
    }
    public void setValue(){
        this.value = value;
    }
    public String getMake()
    {
       return make;
    }
    public void setMake(){
        this.make = make;
    }
    public Bicycle(){
        owner = "";
        value = 0;
        make="";
    }
    public Bicycle(String owner,double value,String make)
    {
        owner = "";
        value = 0;
        make="";
    }
    public String toString(){
        return "Owner: " +owner+ "\nValue: "+value+"\nMake: "+make;
    }

}
