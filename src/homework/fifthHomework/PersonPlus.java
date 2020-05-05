package homework.fifthHomework;

public class PersonPlus extends Person{
    private int sex;    //0是男生，1是女生
    private Boolean vip;

    public PersonPlus(String name, int height, int sex){
        super(name, height);
        this.sex = sex;
    }

    public int getSex(){
        return sex;
    }

    public boolean getVip(){ return vip;}

    public void setVip(){ this.vip = true;}

}
