package Inheritance;

public class mainMethod {
    public static void main(String[] args) {
        Parent father = new Parent(15, false);
        father.eat();
        father.sleep();
        Son son = new Son(42, true);
        son.eat();
        son.sleep();
        son.learn();
        son.eat();
        System.out.println(son.getWeight());
        System.out.println(father.getWeight());
        father.setWeight(92);
        System.out.println(father.getWeight());
        Daughter daughter = new Daughter(45, false);
        System.out.println(daughter.getWeight());
        daughter.setIsMarried(true);
        System.out.println(daughter.getIsMarried());
        daughter.eat();
        son.setIsMarried(false);
        System.out.println("Son marriage is " + son.getIsMarried());
        son.displayName();
        son.setName("Valera");
        son.displayName();
        daughter.displayName();
        daughter.setName("Inna");
        daughter.displayName();
        daughter.learn();
    }
}
