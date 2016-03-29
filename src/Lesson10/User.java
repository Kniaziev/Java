package Lesson10;

import java.io.Serializable;

/**
 * Created by admin on 3/29/2016.
 */
public class User implements Serializable{
    private  String name;
    private  Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public User(String name, Integer age){
         this.name = name;
         this.age = age;

   }

}
