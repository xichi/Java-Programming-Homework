package homework.thirdHomework;

public class Rectangle {
    public int width;
    public int height;
    public Point origin;

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public Point getOrigin(){
        return origin;
    }

    public void setOrigin(Point origin){
        this.origin = origin;
    }

    public Rectangle(int width, int height, Point origin){
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    public int area(){
        return width*height;
    }



}
