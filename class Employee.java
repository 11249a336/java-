class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int empId, String name, double basicSalary,
                      double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + calculateGrossSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        PermanentEmployee emp =
            new PermanentEmployee(101, "Rahul", 30000, 6000, 4500);

        emp.displayDetails();
    }
}       
