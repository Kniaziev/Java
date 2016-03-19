package Inheritance;

public class Daughter extends Parent{

    public Daughter(int weight, boolean isMarried) {
        super(weight, isMarried);
    }

    public void learn(){
        System.out.println("Daughter is learning");
    }
    @Override
    public void eat(){
        System.out.println("Daughter is eating vegetables only!");
    }
}



