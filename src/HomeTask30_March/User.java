/*
package HomeTask30_March;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable{
    private  String name;
    private  Integer age;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); //should be always called
        out.writeObject(getName());
        out.writeObject(getAge());

    }
    private void readObject(ObjectInputStream in)throws IOException, ClassNotFoundException{
        in.defaultReadObject(); //should be always called
        */
/*
        in.readObject(setName());
        in.readObject(setAge());
        *//*

    }


    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }


    public User(String name, Integer age){
        this.name = name;
        this.age = age;

    }


}*/
