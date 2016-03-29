package Inheritance;

public class Son extends Parent {

    public String name = "Kirill";
    public Son(int weight, boolean isMarried) {
        super(weight, isMarried);
        if (this.name == null) this.name = "Vadim";

    }

    public void learn(){
        System.out.println("Son is learning");
    }
    @Override
    public void eat(){
        System.out.println("Son is eating meat!");
    }
}
