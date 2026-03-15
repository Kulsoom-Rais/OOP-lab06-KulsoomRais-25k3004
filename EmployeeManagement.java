class Employee {
    public void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    public void manageTeam(){
        System.out.println("the manager is working ");

    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manageTeam();
    }
}
