package Buybook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
//        顾客购买书时，根据提示输入图书编号来选购需要的书，
//        并根据提示输入购买书的的数量。
//        购买完毕后输出顾客的订单信息，包括：订单号、订单明细、订单总额。
        Scanner sc = new Scanner(System.in);
        List<Book> bs=new ArrayList<>();

        System.out.println("--------------------");
        System.out.println("Java教程   30.6   30");
        System.out.println("Jsp教程   42.1   45");
        System.out.println("SSH教程   47.3   15");
        System.out.println("--------------------");


        while (true) {
            System.out.println("请输入需要购买商品的序列号：");
            int a0 = sc.nextInt();
            System.out.println("请输入图书购买数量：");
            switch (a0) {
                case 1:
                    int amt = sc.nextInt();
                    System.out.println("请继续购买图书");
                    bs.add(new Book("Java教程",30.6,amt));
                    break;
                case 2:
                    int amt2 = sc.nextInt();
                    System.out.println("请继续购买图书");
                    bs.add(new Book("Jsp教程",42.1,amt2));
                    break;
                case 3:
                    int amt3 = sc.nextInt();
                    System.out.println("请继续购买图书");
                    bs.add(new Book("SSH教程",47.3,amt3));
                    break;
            }
            System.out.println("是否继续购买图书（Y or N）");
            String a = sc.next();
            if (a.equals("Y")) continue;
            if (a.equals("N")) {
                System.out.println("已退出购物");
                break;
            }

        }

        System.out.println("\t图书订单");
        System.out.println("图书订单号:  00001");
        System.out.println("图书名称\t图书价格\t购买数量");

        System.out.println("--------------------");
        double s=0;
        for (Book book:bs){
            book.show();
            s+=book.getBookPrice()*book.getMun();
        }

        System.out.println("--------------------");
        System.out.println("订单总额:      "+s);

    }
}
