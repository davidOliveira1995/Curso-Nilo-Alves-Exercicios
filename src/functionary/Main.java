package functionary;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Employee functionaryOne = new Employee();
        System.out.println("Name: ");
        functionaryOne.name = scan.next();

        System.out.println("Gross Salary: ");
        functionaryOne.grossSalary = scan.nextDouble();

        System.out.println("Employee: " + functionaryOne.name +
                ", $ " + functionaryOne.grossSalary);

        System.out.println("Which percentage to increase salary? ");
        functionaryOne.IncreaseSalary(scan.nextDouble());

        scan.close();

        System.out.println(functionaryOne.toString());
    }
}
