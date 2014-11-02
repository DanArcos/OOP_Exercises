public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Circle: radius=" + radius + " color=" + color;
    }
}
