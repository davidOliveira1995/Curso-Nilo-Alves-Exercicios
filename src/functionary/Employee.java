package functionary;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        grossSalary += NetSalary() * (percentage /100);
    }

    public String toString() {
        return "Update data: " + this.name
                + ", $ " + NetSalary();
    }
}
