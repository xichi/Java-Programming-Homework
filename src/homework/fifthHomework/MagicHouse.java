package homework.fifthHomework;

public class MagicHouse implements MagicHouseVIP, MagicHouseSVIP{

    public void enterHouse(Person person){
        System.out.println("进入魔法妙妙屋之前" + person.getName() + "身高是：" + person.getHeight());
    }

    public Bread findBread(Person person){
        System.out.println(person.getName() + "吃面包长高");
        return new Bread();
    }

    public MagicMachine findMachine(Person person){
        System.out.println(person.getName() + "尝试魔法机器");
        return new MagicMachine();
    }

    public void registerHouseVIP(PersonPlus person){
        person.setVip();
        System.out.println(person.getName() + "成功注册魔法屋VIP会员");
    }

    public void registerHouseSVIP(PersonPro person){
        person.setSVIP();
        System.out.println(person.getName() + "成功注册魔法屋超级VIP会员");
    }
}
