package HomeWork_4;

import java.util.Arrays;

public class Employee {
    private String name;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }


    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return rate;
    }

    public void setAge(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalhours() {
        return totalhours;
    }

    public static void setTotalhours(double totalhours) {
        Employee.totalhours = totalhours;
    }

    private double hours;
    private static double totalhours;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double salary() {
        return rate * hours;
    }
    public void changeRate(double rate){
        this.rate=rate;
    }
    public double bonuses(double bonus){
        return salary()*bonus;
    }


}




