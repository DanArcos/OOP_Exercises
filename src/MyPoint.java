
public class MyPoint {
    private int x;
    private int y;

    //Add Constructors
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Add appropriate getters and setters
    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Override toString
    public String toString(){
        return "("+x+","+y+")";
    }

    //This calculates the distance between this object (Point's) location and another coordinate
    public double distance (int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    //This calculates the distance between this object (Point's) and another Point object
    //This does the exact same thing as the previous method, however different parameters are introduced.
    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
}
