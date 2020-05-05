package homework.fifthHomework;

public class Person {
    private int height;
    private String name;

    public Person(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return name;
    }


    public int getHeight(){
        return height;
    }

    public void increaseHeight(int height){
        this.height += height;
    }

    public void decreaseHeight(int height){
        this.height -= height;
    }
}
