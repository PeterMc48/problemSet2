public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){
        this.getName();
    }
    public Person(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
