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
    public void moveHorizontally(float x){
         this.xVal += x;

    }
    public void moveVertically(float y){
        this.yVal += y;
    }
    public void translate(float x,float y){
        this.xVal +=x;
        this.yVal +=y;
    }
    public void distanceFromOrgin(float x, float y){

        float z = (float)Math.sqrt(((x*x)+(y*y)));
    }
    public String toString(){

        return "Starting point for X"+xVal+ "\nStarting point for Y "+yVal;

    }
}
