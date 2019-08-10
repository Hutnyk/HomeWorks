package HomeWork_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //HomeWork_1
        System.out.println("Home Work 1");
        double PI=3.14;
        double radius;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть радіус");
        radius = scanner.nextInt();
        double Perimetr = PI*2*radius;
        System.out.println("Perimetr = " + Perimetr);
        Perimetr=PI*radius*radius;
        System.out.println("Area = " + Perimetr);
        //HomeWork_2
        System.out.println("Home Work 2");
        String name;
        int age;
        System.out.println("What is your name?");
        name=scanner.next();
        System.out.println("How are old you?");
        age=scanner.nextInt();
        System.out.println("You name "+ name+ " and You are "+ age + " years old");




    }
}


