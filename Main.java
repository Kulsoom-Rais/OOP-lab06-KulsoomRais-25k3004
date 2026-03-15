class Animal{
    public void sound(){
        System.out.println("there are different sounds of different animals");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat Meow");
    }
}
public class Main {
    public static void main(String[] args){
    Animal d = new Dog();
    Animal c = new Cat();
    d.sound();
    c.sound();
}
}
