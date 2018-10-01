import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args) {
        //Animal an = new Animal();
        Animal[] animals;
        animals= new Animal[Integer.parseInt(JOptionPane.showInputDialog("How many animals:"))];

        String type;
        double weight;
        int age;
        String[] con;


        for(Animal a: animals){
           a = new Animal();
            a.setType(JOptionPane.showInputDialog("Type:"));
            a.setContinents(getContinents());
            a.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Weight:")));
            a.setAge(Integer.parseInt(JOptionPane.showInputDialog("Age:")));
        /*
            type =  JOptionPane.showInputDialog("Type:");
            weight = Double.parseDouble(JOptionPane.showInputDialog("Weight:"));
            age = (Integer.parseInt(JOptionPane.showInputDialog("Age:")));
            con = getContinents();
*/
            //a = new Animal(type,con,weight,age);

        }

        for(Animal a: animals){
            JOptionPane.showMessageDialog(null,a);
        }

        //animal.setContinents(getContinents());




    }
    public static String[] getContinents(){

        String[] con = new String[2];

        for(String c: con){
            c = JOptionPane.showInputDialog("enter Continent");
        }
        return con;
    }

}
