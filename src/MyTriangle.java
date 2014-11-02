
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //Constructor: Build Triangle by providing coordinates for all end points
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    //Constructor: Build Triangle by providing three different Point objects
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    //Override toString()
    public String toString(){
        return "Triangle @ " + v1.toString()+","+v2.toString()+","+v3.toString();
    }
}
