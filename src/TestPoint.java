
public class TestPoint {
   public static void main(String[] args){
       MyPoint p1 = new MyPoint(3,0);
       System.out.println(p1);
       System.out.println(p1.getX());
       System.out.println(p1.getY());
       p1.setX(1);
       System.out.println(p1);
       p1.setY(1);
       System.out.println(p1);
       p1.setXY(4,4);
       System.out.println(p1);

       MyPoint p2 = new MyPoint(0,4);

       System.out.println(p1.distance(p2));
       System.out.println(p1.distance(5,6));

       MyPoint[] points = new MyPoint[11];
       for (int i = 0; i < 11; i++){
           points[i] = new MyPoint(i,i);
           //System.out.println(points[i]);
       }
   }
}
