package homework.fifthHomework;

public class PersonPro extends PersonPlus {
    private int money;
    private Boolean SVIP;

    public PersonPro(String name, int height, int sex, int money){
        super(name, height, sex);
        this.money = money;
    }

    public boolean getSVIP(){ return SVIP;}

    public void setSVIP(){ this.SVIP = true;}

    public int costMoney(int cost){
        this.money -= cost;
        return this.money;
    }

    public int chargeMoney(int money){
        this.money += money;
        return money;
    }

    public int getMoney(){return money;}

}
