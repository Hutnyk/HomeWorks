
import java.util.Arrays;

public class Empoyee {
    private String name;
    private String departament;
   private double Salary;

    public Empoyee(String name, String departament, double salary) {
        this.name = name;
        this.departament = departament;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}




