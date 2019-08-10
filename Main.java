package HomeWork_3;

import java.util.Scanner;

public class Main {
    public enum Continens {Europa, Afrika, Asia, North_Amerika}

    public static void main(String[] args) {
        //HomeWork_1
        Continens continens;
        switch (Continens) {
            case "Ukraine":
            case "Poland":
            case "France":
                continens = Continens.Europa;
                break;
            case "Egypt":
            case "Niger":
            case "Bolivia":
                continens = Continens.Afrika;
                break;
            case "China":
            case "Japan":
            case "Russia":
                continens = Continens.Asia;
                break;
            case "USA":
            case "Mexiko":
            case "Kanada":
                continens = Continens.North_Amerika;
                break;
            default:
                System.out.println("No ");



        }
        //HomeWork_2



        int myArray[] = {1, 3, -4, -6, -3, -50, 20, 10, -6, -2};
        int biggest=myArray[0];
        for (int i=0;i<10;i++) {
            if (biggest < myArray[i])
                biggest = myArray[i];
        }
        System.out.println(biggest);
        //HomeWork_3

        System.out.print("Результат: ");
        int sum=0;
        for (int i=0;i<10;i++){
            if (myArray[i]>0){
                sum+=myArray[i];
            }
        }
        //HomeWork_4
        int pos=0;
        int neg=0;
        for (int i=0;i<10;i++){
            if (myArray[i]>0){
                pos++;
            }else if (myArray[i]<0){
                neg++;
            }
        }if (pos>neg){
            System.out.print("Позитивних більше");
        }else {
            System.out.print("Негативних більше");
        }

        }
    }





