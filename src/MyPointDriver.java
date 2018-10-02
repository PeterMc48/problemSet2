import javax.swing.*;

public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        float x=0;
        float y=0;
        point.setxVal(x);
        point.setyVal(y);
        point.moveHorizontally(2.5f);
        point.moveVertically(3.5f);
        point.translate(x,y);
        point.distanceFromOrgin(x,y);

        JOptionPane.showMessageDialog(null,point.toString());
    }

}
