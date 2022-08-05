package Zoo;

public class Text {
    public static void main(String[] args) {
//        （1）	饲养员给小狗喂骨头，小狗汪汪叫。
//        （2）饲养员给小猫喂小鱼，小猫喵喵叫。

        System.out.println("欢迎来到动物园！");
        System.out.println("我是饲养员 小华");
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.eat();
        cat.eat();
    }
}
