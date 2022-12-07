import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        Integer employeesNumber = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < employeesNumber; i++) {
            System.out.println(String.format("\nEmployee #%d data:\n", i+1));
            System.out.print("Outsourced (y/n)?");
            sc.nextLine();
            Boolean outsourced = sc.nextLine().equalsIgnoreCase("y")?true:false;
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Hours:");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour:");
            Double valuePerHour = sc.nextDouble();
            if(outsourced){
                System.out.println("Additional charge:");
                Double additionalCharge = sc.nextDouble();
                Employee employeeData = new OutsourcedEmployee(hours, valuePerHour, name, additionalCharge);
                list.add(employeeData); 
            }else{
                Employee employeeData = new Employee(hours, valuePerHour, name);
                list.add(employeeData);
            }
        }

        for (Employee employee : list) {
            System.out.println(employee);
        }

        sc.close();
    }
}

