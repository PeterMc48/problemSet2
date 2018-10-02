public class MyPoint {
    //attributes
    private float xVal;
    private float yVal;
    //accessor
    public float getxVal(){
        return xVal;
    }
    //mutator
    public void setxVal(float xVal){
        this.xVal=xVal;
    }
    //accessor
    public float getyVal(){
        return yVal;
    }
    //mutator
    public void setyVal(float yVal){
        this.yVal=yVal;
    }
    //no argument constructor
    public MyPoint(){
        xVal = 0;
        yVal = 0;
    }
    //2 argument constructor
    public MyPoint(float xVal, float yVal)
    {
        setxVal(xVal);
        setyVal(yVal);
    }
    //methods
    public void moveHorizontally(float xVal){

        setxVal(xVal);

    }
    public void moveVertically(float yVal){
        setyVal(yVal);
    }
    public void translate(float xVal,float yVal){
        setyVal(yVal);
        setxVal(xVal);
    }
    public static float distanceFromOrgin(float xVal, float yVal){

        float z = (float)Math.sqrt(((xVal*xVal)+(yVal*yVal)));
        return z;
    }
    public String toString(){

        return "Starting point for X was 0"+ "\nStarting point for Y was 0"+
                "\nX Moved Horizontally "+ xVal+
                "\nY Moved Vertically " + yVal +
                "\nDistance from orginal point " + String.format("%.2f",distanceFromOrgin(xVal,yVal));

    }
}
