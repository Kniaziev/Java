package Generics;


public class Box<T, E> {
    private T t;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    private E e;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Box<Integer, Integer> integerBox = new Box<>();
        Box<String, Integer> stingBox = new Box<>();

        integerBox.setT(123);
        integerBox.setE(444);
        stingBox.setT("Hello world");
        stingBox.setE(55);
        System.out.printf("First Integer value :%d and the second Integer is %d\n\n", integerBox.getT(), integerBox.getE());
        System.out.printf("String value :%s and Integer value is %s\n", stingBox.getT(), stingBox.getE());
    }


}
