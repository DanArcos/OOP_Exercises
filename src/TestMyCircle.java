//This is another test of the circle object
public class TestMyCircle {
    public static void main(String[] args){
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(1,1,2);

        MyPoint center = new MyPoint(2,3);
        MyCircle c3 = new MyCircle(center, 4);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();

        System.out.println(c1.getArea());
        System.out.println(c1.getCenter());
        System.out.println(c1.getCenterX());
        System.out.println(c1.getCenterY());
        System.out.println(c1.getRadius());

        c1.setCenter(center);

        System.out.println(c1.toString());

        c1.setCenterXY(2,7);

        System.out.println(c1.toString());
    }
}
