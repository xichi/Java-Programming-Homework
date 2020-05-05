package homework.thirdHomework;

public class CreateObjectDemo {
    public static void main(String[] args){
        Point origin_one = new Point( 23, 94 );
        Rectangle rect_one = new Rectangle( 100, 200, origin_one);
        Rectangle rect_two = new Rectangle( 50, 100);
        //Show width, height and area of react_one
        System.out.println("Width of rect_one: " + rect_one.getWidth());
        System.out.println("Height of rect_one: " + rect_one.getHeight());
        System.out.println("Area of rect_one: " + rect_one.area());
        //rect_two
        rect_two.setOrigin(origin_one);
        System.out.println("X Position of rect_two: " + rect_two.getOrigin().getX());
        System.out.println("Y Position of rect_two: " + rect_two.getOrigin().getY());

        //rect_two.move
        rect_two.move(40, 72);
        System.out.println("X Position of rect_two: " + rect_two.getOrigin().getX());
        System.out.println("Y Position of rect_two: " + rect_two.getOrigin().getY());
    }
}
