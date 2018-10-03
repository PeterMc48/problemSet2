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
    public void moveHorizontally(float units){

        xVal = xVal+units;

      //  setxVal(xVal);

    }
    public void moveVertically(float units){
        yVal = yVal+units;
    }
    public void translate(float x,float y){
        setyVal(yVal);
        setxVal(xVal);
    }

    public String toString(){

        /*return "Starting point for X was 0"+ "\nStarting point for Y was 0"+
                "\nX Moved Horizontally "+ xVal+
                "\nY Moved Vertically " + yVal +
           */
        return "The point is: ("+ this.xVal +","+this.yVal+")\n";

    }
}
