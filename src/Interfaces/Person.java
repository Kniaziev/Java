package Interfaces;

public class Person implements Info{
    public String name;
//конструктор присвает полю name , то значение, которое пришло в аргументе
    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }

    @Override
    public void jump() {
        System.out.println("Person "+ name + " is jumping!");
    }
}
