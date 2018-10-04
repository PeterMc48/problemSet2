public class Bicycle {
    private String owner;
    private double value;
    private String make;

    public String getOwner()
    {
        return owner;
    }
    public void setOwner(String owner)
    {
        this.owner=owner;
    }
    public double getValue()
    {
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
    public String getMake()
    {
       return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public Bicycle(){
        this("",0,"");
    }
    public Bicycle(String owner,double value,String make)
    {
        setMake(make);
        setValue(value);
        setOwner(owner);
    }
    public String toString(){
        return "Owner: " +owner+ "\nValue: "+String.format("%.2f",value)+"euros"+"\nMake: "+make;
    }

}
