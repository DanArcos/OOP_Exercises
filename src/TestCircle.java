//Create 3 different drones and test their methods
//This will print circle methods to see if they work
public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println("The circle has radius of "+c1.getRadius()+" and area of "+c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "+c2.getRadius()+" and area of "+c2.getArea());
        Circle c3 = new Circle(3.0, "orange");
        System.out.println("The circle has radius of "+c3.getRadius()+" and area of "+c3.getArea() + " and color of " + c3.getColor());
        c3.setRadius(4.0);
        c3.setColor("blue");
        System.out.println("The circle has radius of "+c3.getRadius()+" and area of "+c3.getArea() + " and color of " + c3.getColor());
        System.out.println(c3);
    }
}
