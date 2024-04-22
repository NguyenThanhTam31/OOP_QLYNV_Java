// package employee;

import java.util.Scanner;

public class Main{
    
    static Scanner s = new Scanner(System.in);

    static int ch;

    static int id ;
    static String name;
    static int age ;
    static String department ;
    static String code ;
    static double salaryRate ;

    public static void main(String[] args){
        EmployeeManager manager = new EmployeeManager();
        
        manager.addEmployee(new Employee(1, "Nguyen Thanh Tam", 20, "IT", "IT001", 1.5));
        manager.addEmployee(new Employee(2, "Nguyen Thanh A", 32, "BA", "BA001", 1.0));
        manager.addEmployee(new Employee(3, "Nguyen Truong Giang", 20, "PM", "PM001", 1.1));
        manager.addEmployee(new Employee(4, "Nguyen Thanh B", 38, "BA", "BA002", 1.3));
        manager.addEmployee(new Employee(5, "Nguyen Truong F", 20, "IT", "IT002", 1.2));
        manager.addEmployee(new Employee(6, "Nguyen Thanh C", 32, "BA", "BA003", 1.3));
        manager.addEmployee(new Employee(7, "Nguyen Truong G", 21, "IT", "IT003", 1.5));
        manager.addEmployee(new Employee(8, "Nguyen Thanh D", 32, "BA", "BA004", 1.6));
        manager.addEmployee(new Employee(9, "Nguyen Truong H", 22, "IT", "IT004", 1.5));
        manager.addEmployee(new Employee(10, "Nguyen Thanh E", 32, "BA", "BA005", 1.8));

  
        do{
            System.out.println("1.Insert Employee");
            System.out.println("2.Show list of Employees ");
            System.out.println("3.Delete Employee");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1 : 
                    EnterDetailEmployeeToAdd();

                    manager.addEmployee(new Employee(id, name, age, department, code, salaryRate));
                break;

                case 2: 
                    System.out.println("            --------List Employees--------");
                    manager.displayAllEmployees();
                    System.out.println("                    ************        ");
                break;

                case 3: 
                    System.out.print("ID Employee to Delete: ");
                    int id_to_del = s.nextInt();

                    boolean result = manager.removeEmployee(id_to_del);
                    
                    if(result == true){
                        manager.displayAllEmployees();
                        System.out.println("Deleted Success");
                        
                    }
                    else{
                        manager.displayAllEmployees();
                        System.out.println("No have ID " + id_to_del + " to delete");
                    }
                    
                break;
            
                default:
                    break;
            }
        }while(ch != 0);
        s.close();

    }

    private static void EnterDetailEmployeeToAdd(){
        System.out.print("ID : ");
        id = s.nextInt();

        s.nextLine();

        System.out.print("Name : ");
        name = s.nextLine();

        System.out.print("Age : ");
        age = s.nextInt();

        s.nextLine();

        System.out.print("Department : ");
        department = s.nextLine();

        System.out.print("Code : ");
        code = s.nextLine();

        System.out.print("salaryRate : ");
        salaryRate = s.nextDouble();
    }

}

    

