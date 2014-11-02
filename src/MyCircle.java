
public class MyCircle {

    private MyPoint center;
    private int radius;

    //Add Constructors
    public MyCircle(){
        this.center = new MyPoint();
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    //Add Getters and Setters
    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return center;
    }

    public void setCenter (MyPoint center){
        this.center=center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    
    //Override toString()
    public String toString(){
        return "Circle @ "+center.toString()+ " radius = "+radius;
    }

    //Incorporate the number Pi in order to calculate the area!
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
