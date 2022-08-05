package shopping;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("----叶氏百货----");

        Supermarket s=new Supermarket();

        while (true){
            System.out.println("1.牙刷的价格为： 8.8元");
            System.out.println("2.毛巾的价格为： 10.0元");
            System.out.println("3.水杯的价格为： 18.8元");
            System.out.println("4.苹果的价格为： 12.5元");
            System.out.println("5.香蕉的价格为： 15.5元");

            System.out.println("请输入需要购买商品的序列号：");
            int a0=sc.nextInt();
            switch (a0){
                case 1:
                    System.out.println("请输入你需要购买的牙刷的数量：");
                    int amt=sc.nextInt();
                    System.out.println("你购买"+amt+"支牙刷共花费："+amt * s.getYsPrice());
                    break;
                case 2:
                    System.out.println("请输入你需要购买的毛巾的数量：");
                    int amt2=sc.nextInt();
                    System.out.println("你购买"+amt2+"条毛巾共花费："+amt2 * s.getMjPrice());
                    break;
                case 3:
                    System.out.println("请输入你需要购买的水杯的数量：");
                    int amt3=sc.nextInt();
                    System.out.println("你购买"+amt3+"个水杯共花费："+amt3 * s.getSbPrice());
                    break;
                case 4:
                    System.out.println("请输入你需要购买的苹果的数量：");
                    int amt4=sc.nextInt();
                    System.out.println("你购买"+amt4+"斤苹果共花费："+amt4 * s.getApplePrice());
                    break;
                case 5:
                    System.out.println("请输入你需要购买的香蕉的数量：");
                    int amt5=sc.nextInt();
                    System.out.println("你购买"+amt5+"斤香蕉共花费："+amt5 * s.getBananaPrice());
                    break;
            }
            System.out.println("是否继续购物 Y or N");

            String a=sc.next();
            if (a.equals("Y")) continue;
            if (a.equals("N")){
                System.out.println("已退出购物");
                break;
            }
        }
    }
}
