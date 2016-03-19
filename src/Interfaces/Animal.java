package Interfaces;

public class Animal implements Info{
    public int id;
//конструктор
    public Animal(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("Animal with id "+id+" is sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + id);
    }

    @Override
    public void jump() {
        System.out.println("Animal " + id + " is jumping");
    }
}
