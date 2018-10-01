public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public String getType(){
        return type;
    }
    public String[] getContinents(){
        return continents;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setContinents(String[] continents)
    {
        this.continents = continents;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Animal(){
        type = "No Type Specified";
        continents = null;
        weight = 0.0;
        age = 0;
    }
    public String toString(){

        return "Type" + type + "\nContinents: "+ continents +"\n" + continents + "\nweight: " + weight +
                "\nAge: "+age;
    }
    public Animal(String type,String[] continents,double weight, int age){

        setType(type);
        setContinents(continents);
        setAge(age);
        setWeight(weight);
    }


}
