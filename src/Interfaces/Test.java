package Interfaces;


public class Test {
    public static void main(String[] args) {
       Animal animal1 = new Animal(1);
        //animal1.sleep();
        Person person1 = new Person("Bob");

       /* person1.sayHello();
        person1.showInfo();
        animal1.showInfo();*/

        //Тип переменной может не соответствовать классу.
        Info info1 = new Animal(2);
        Info info2 = new Person("James Bond");
       //  info1.showInfo();
       // info2.showInfo();
       // info1.jump();
       // info2.jump();


        //Методу можно подать на вход объекты
        outputInfo(animal1);
        outputInfo(person1);

        outputInfo(info1);
        outputInfo(info2);
        outputJump(info1);
        outputJump(info2);

    }
//метод принимает на вход в качестве аргументов нечто что реализует класс Info.(например объект)
    public static void outputInfo(Info info){
        info.showInfo();
        }
    public static void outputJump (Info info){
        info.jump();
    }
    }

