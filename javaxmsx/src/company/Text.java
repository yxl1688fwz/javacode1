package company;

import java.util.Scanner;
public class Text {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入员工姓名：");
        String name=sc.next();
        System.out.println("请输入新员工应聘的语言");
        String language=sc.next();

        switch (language){
            case "java":
                System.out.println(name+"被分配到java开发部门");
                break;
            case "C#":
                System.out.println(name+"被分配到C#开发部门");
                break;
            case "asp.net":
                System.out.println(name+"被分配到asp.net程序测试部门");
                break;
            case "前端":
                System.out.println(name+"前端程序开发部门");
                break;
            default:
                System.out.println("你输入的语言有误！");
        }
    }
}
