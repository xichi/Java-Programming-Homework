package homework.fifthHomework;

public class Bread {
    public void eatBread(Person person, int number){
        for(int i=0; i < number; i++){
            System.out.println(person.getName() + "吃了一片面包");
            person.increaseHeight(1);
            System.out.println("现在" + person.getName() + "身高是：" + person.getHeight());
        }
    }
}
