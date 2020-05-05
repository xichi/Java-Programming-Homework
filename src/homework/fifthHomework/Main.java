package homework.fifthHomework;

public class Main {
    public static void main(String[] args){
        Person person = new Person("小明", 140);
        MagicHouse magicHouse = new MagicHouse();
        magicHouse.enterHouse(person);
        System.out.println("======================");
        magicHouse.findBread(person).eatBread(person, 2);
        System.out.println("======================");
        magicHouse.findMachine(person).useMachine(person);
        System.out.println("##########################");
        System.out.println("魔法屋的故事续集1---VIP会员真不错");
        System.out.println("##########################");
        PersonPlus person1 = new PersonPlus("小芳", 130, 1);
        PersonPlus person2 = new PersonPlus("小张", 145, 0);
        magicHouse.registerHouseVIP(person1);
        magicHouse.registerHouseVIP(person2);
        System.out.println("======================");
        magicHouse.enterHouse(person1);
        magicHouse.enterHouse(person2);
        System.out.println("======================");
        magicHouse.findMachine(person1).useMachine(person1);
        magicHouse.findMachine(person2).useMachine(person2);
        System.out.println("##########################");
        System.out.println("魔法屋的故事续集2---魔法机器里的惊魂一刻！");
        System.out.println("##########################");
        PersonPro person3 = new PersonPro("小明", 192, 0, 0);
        magicHouse.registerHouseSVIP(person3);
        magicHouse.enterHouse(person3);
        System.out.println("======================");
        try{
            magicHouse.findMachine(person3).useMachine(person3);
        } catch (SecurityException e){
            System.out.println("魔法机器：错误：余额不足");
        }
        System.out.println("======================");
        System.out.println("小明往账户里冲入350元");
        person3.chargeMoney(350);
        System.out.println("现在" + person3.getName() + "的账户余额是：" + person3.getMoney());
        System.out.println("======================");
        try{
            magicHouse.findMachine(person3).useMachine(person3);
        } catch (SecurityException e){
            System.out.println("魔法机器：错误：余额不足");
        }
        System.out.println("======================");

    }

}
