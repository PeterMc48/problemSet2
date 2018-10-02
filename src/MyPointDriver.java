import javax.swing.*;

public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        float x = point.getxVal();
        float y = point.getyVal();
        point.moveHorizontally(x += 2.5f);
        point.moveVertically(y+=3.5f);

        point.translate(x,y);
        point.distanceFromOrgin(x,y);

        JOptionPane.showMessageDialog(null, point.toString());
    }

}
