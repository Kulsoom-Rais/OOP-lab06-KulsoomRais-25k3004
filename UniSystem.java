class Person{
    public void displayPerson(){
        System.out.println("person is doing great");
    }
}
class Student extends Person{
    public void displayStudent(){
        System.out.println("student is studying");

    }
}
class GraduateStudent extends Student{
    public void research(){
        System.out.println("Graduate Student is doing research");
    }
}
public class UniSystem {
    public static void main(String[] args){
        GraduateStudent GradStd = new GraduateStudent();
        GradStd.displayPerson();
        GradStd.displayStudent();
        GradStd.research();
    }
}
