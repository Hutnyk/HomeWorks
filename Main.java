package HomeWork_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //HomeWork_1
        boolean isLeap = false;
        System.out.println("Введіть рік");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if (year % 4 != 0 && (year % 400 != 0)) {
            isLeap = false;
        } else if (year % 100 != 0) {
            isLeap = true;
        } else {
            isLeap = true;
        }
        System.out.println(isLeap);
        //HomeWork_2
        System.out.println("Введіть кількість рядків");
        int rows=scanner.nextInt();
        int d=0;
        for (int i=0;i<=rows;i++){
            for (int space=1;space<=rows-i;space++){
                System.out.println(" ");}
                System.out.println();
            }
        //HomeWork_3
        System.out.println("Введіть число");
        double number=scanner.nextInt();
        double sum1=0;
        double sum2;
        double result=0;
        for (int i=0;i<number;i++){
            sum2=Math.pow((double)10,(double)i)+sum1;
            sum1=sum2;
            result+=sum2;
        }
        System.out.println("Result= "+ (int)result);

        }





    }



