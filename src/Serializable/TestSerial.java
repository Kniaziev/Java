package Serializable;

import Interfaces.Test;

import java.io.*;

public class TestSerial implements Serializable {

    public int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos); // передача объекта fos
        TestSerial ts = new TestSerial(); //сохранение состояния экземпляра TestSerial в файл с именем temp.out
        oos.writeObject(ts);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        ts = (TestSerial) oin.readObject();
        ts.setAge(10);
        ts.setName("Валера");
        System.out.println("Age = "+ ts.getAge() + " Name is " + ts.getName());


    }


}
