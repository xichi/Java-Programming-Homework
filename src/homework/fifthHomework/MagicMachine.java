package homework.fifthHomework;

public class MagicMachine {
    public void useMachine(Person person){
            person.increaseHeight(50);
            System.out.println("现在" + person.getName() + "身高是：" + person.getHeight());
            System.out.println("太神奇了！");
    }
    public void useMachine(PersonPlus person){
        if(person.getVip() == true && person.getSex() == 0){
            System.out.println("********************************");
            System.out.println("魔法机器：尊贵的VIP，感谢您体验魔法机器");
            System.out.println("魔法机器：机器识别出您是：男生");
            System.out.println("魔法机器：机器将使您增高：40厘米");
            System.out.println("********************************");
            person.increaseHeight(40);
            System.out.println("现在" + person.getName() + "身高是：" + person.getHeight());
        }else if(person.getVip() == true && person.getSex() == 1){
            System.out.println("********************************");
            System.out.println("魔法机器：尊贵的VIP，感谢您体验魔法机器");
            System.out.println("魔法机器：机器识别出您是：女生");
            System.out.println("魔法机器：机器将使您增高：30厘米");
            System.out.println("********************************");
            person.increaseHeight(30);
            System.out.println("现在" + person.getName() + "身高是：" + person.getHeight());
        }
    }
    public void useMachine(PersonPro person){
        if(person.getSVIP() == true){
            System.out.println("********************************");
            System.out.println("魔法机器：尊贵的超级VIP，感谢您体验魔法机器");
            System.out.println("魔法机器：尊贵的超级VIP可以享受定制的增高或降低服务");
            System.out.println("魔法机器：本次服务将收取费用：100元");
            if(person.costMoney(100) < 0){
                person.chargeMoney(100);
                throw new SecurityException();
            }else{
                person.decreaseHeight(10);
            }
            System.out.println("魔法机器：机器识别出您是：" + (person.getSex() == 0 ? "男生" : "女生"));
            System.out.println("魔法机器：机器将使您降低：10厘米");
            System.out.println("********************************");
            System.out.println("现在" + person.getName() + "身高是：" + person.getHeight());
            System.out.println("现在" + person.getName() + "的账户余额是：" + person.getMoney());
        }else{
            System.out.println("你还不是超级会员。");
        }

    }
}
