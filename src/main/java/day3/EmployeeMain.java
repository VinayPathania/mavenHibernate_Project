package day3;


import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) throws EmployeeException{
        empDaoImpl mp = new empDaoImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Aditya Birla Company");
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        System.out.println("Please select Option according to your choice");
        System.out.println("Press 1 : saving new Employee Detail");
        System.out.println("Press 2 : for finding Employee");
        System.out.println("Press 3 : for Deleting Employee");
        System.out.println("Press 4 : for Updating existing Employee Detail");

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        System.out.println("Enter your choice");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("Enter Employee name");
            String name = sc.next();

            System.out.println("Enter Employee Address");
            String address = sc.next();

            System.out.println("Enter Employee Salary");
            int salary = sc.nextInt();
            emp Emp = new emp(name,address,salary);
            mp.save(Emp);
        }
        else if(n==2){
            System.out.println("Enter Employee Id");
            int empId = sc.nextInt();
            System.out.println(mp.getEmployee(empId));
        } else if (n==3) {
            System.out.println("Enter Employee Id");
            int empId = sc.nextInt();
            System.out.println(mp.deleteEmployee(empId));
        } else if (n==4) {
            System.out.println("Enter Employee name");
            String name = sc.next();

            System.out.println("Enter Employee Address");
            String address = sc.next();

            System.out.println("Enter Employee Salary");
            int salary = sc.nextInt();
            emp Emp = new emp(name,address,salary);
            boolean flag = mp.updateEmployee(Emp);
            if(flag) System.out.println("Employee detail updated");
        }


    }
}
