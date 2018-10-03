import javax.swing.*;

public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        MyPoint point2 = new MyPoint(0,0);
        System.out.print(("Starting Point: "+point2.toString()));
        point2.moveHorizontally(2);
        System.out.print("Move point horizontally:" +point2.toString());
        point2.moveVertically(3);
        System.out.print("Move point Vertically: "+point2.toString());

    }
    public static float distanceFromOrgin(float xVal, float yVal){

        float z = (float)Math.sqrt(((xVal*xVal)+(yVal*yVal)));
        return z;
    }

}
