import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        List<Employee> employees = new ArrayList<>();
        int numEmp = sc.nextInt();
        for(int i=0; i<numEmp; i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.println("Outsourced (y/n)?");
            sc.nextLine();
            String outsourced = sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Hours:");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
if(outsourced=="y"){
    System.out.println("Additional charge:");
    double additionalCharge = sc.nextDouble();
    Employee employee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
    employees.add(employee);
}else {
    Employee employee = new Employee(name,hours,valuePerHour);
    employees.add(employee);
}

        }
for(Employee employee : employees){
    System.out.printf(employee.getName() + "- $" + "%.2f\n", employee.payment());
}


    }
}