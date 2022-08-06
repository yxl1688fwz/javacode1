package Bank;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
//        写一个帐户类实现银行帐户的概念，创建帐户类的对象ba，
//        假设ba的账号为:123456，初始的存款余额为500元。
//        首先向该账户存入1000元，再取出800元。
        Scanner sc=new Scanner(System.in);
        Bank ba=new Bank();
        System.out.println("0--11-----退出");
        System.out.println("1-----222----存款");
        System.out.println("2-----33----取款");
        System.out.println("3---------查询");
        while (true) {

            System.out.println("请输入所需服务：");
            int x = sc.nextInt();
            switch (x) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("请输入需要存入的金额：");
                    int a = sc.nextInt();
                    ba.add(a);
                    break;
                case 2:
                    System.out.println("请输入需要取出的金额：");
                    int a2 = sc.nextInt();
                    ba.out(a2);
                    break;
                case 3:
                    ba.select();
                    break;
            }
        }

    }
}
