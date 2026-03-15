class Emp{
    double salary=50000.0;
    public void displaySalary(){
        System.out.println("salary is "+ salary);
    }
}
class PermanentEmployee extends Emp{
    public double calculateBonus(){
       double bonus = salary * 0.10;
        return bonus;
    }
}

public class Company {
    public static void main(String[] args){
        PermanentEmployee p = new PermanentEmployee();
        p.displaySalary();
        double bonus =p.calculateBonus();
        int B = (int)bonus;
        System.out.println("your Bonus is "+ B);
    }
}

