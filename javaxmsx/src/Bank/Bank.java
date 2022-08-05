package Bank;

public class Bank {
    private int money=500;


    public void add(int m){
        this.money+=m;
        System.out.println("您已成功存款"+m+"元！");
    }

    public void out(int m){
        this.money-=m;
        System.out.println("您已成功取款"+m+"元，当前余额"+this.getMoney());
    }

    public void select(){
        System.out.println("您的余额为"+this.getMoney());
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
