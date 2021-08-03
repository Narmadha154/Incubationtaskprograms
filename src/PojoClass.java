import java.util.Scanner;

public class PojoClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee name:");
        String name=sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the employee id:");
        int id=sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the employee salary:");
        Double salary=sc2.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter the employee age:");
        int age=sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("enter the city :");
        String city=sc4.nextLine();
        Employee obj =new Employee();
        obj.setName(name);
        obj.setId(id);
        obj.setSalary(salary);
        obj.setAge(age);
        obj.setCity(city);
        obj.print();
    }

}
