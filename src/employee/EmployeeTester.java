
package employee;

import java.util.Scanner;

public class EmployeeTester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp;
        String name, prompt;
        int type;
        double rate;
        int hours;
        
        do{
            emp = new Employee();
            while(true) {
                System.out.print("Please enter name(" + emp.getNameRules() + "): ");
                name = scan.nextLine();
                if(emp.setName(name)) break;
            }

            while(true) {
                System.out.print("Please enter type(" + emp.getTypeRules() + "): ");
                type = scan.nextInt();
                if(emp.setType(type)) break;
            }

            while(true) {
                System.out.print("Please enter hours(" + emp.getHourRules() + "): ");
                hours = scan.nextInt();
                if(emp.setHours(hours)) break;
            }

            while(true) {
                System.out.print("Please enter rate(" + emp.getRateRules() + "): ");
                rate = scan.nextDouble();
                if(emp.setRate(rate)) break;
            }

            System.out.println("------------------");
            System.out.println("Pay for this week for " + emp.getName());
            System.out.println("$" + emp.getPay());
            
            System.out.println("Enter another(y or no): ");
            prompt = scan.next();
            scan.nextLine();
        } while(prompt.equals("y") || prompt.equals("Y"));
    }

}
