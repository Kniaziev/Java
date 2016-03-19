package Inheritance;

public class Parent {
    private int weight;
    private boolean isMarried;
    private String name = "GodFather";

    public Parent(int weight, boolean isMarried) {
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void displayName(){
        System.out.println(getName());
    }
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setIsMarried(boolean newMarried){
        this.isMarried = newMarried;
    }
    public boolean getIsMarried(){
        return this.isMarried;
    }
    public void eat() {
        System.out.println("Parent eating everything");
    }
    public void sleep() {
        System.out.println("I'm sleeping");
    }

}
