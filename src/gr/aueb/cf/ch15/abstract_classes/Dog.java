package gr.aueb.cf.ch15.abstract_classes;

public class Dog extends Animal {


    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating...");
    }
}
