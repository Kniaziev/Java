package Lesson10;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        File file = new File("name.txt");
 /*       System.out.println(file.createNewFile());
         file.createNewFile();
        //file. lots of methods
        System.out.println(file.getAbsolutePath());

        FileInputStream is = new FileInputStream(file);

        Integer temp;
        while ((temp = is.read()) !=-1){
            Character c = null;
        }
        is.close();   //closing stream

        List<String> list = new LinkedList<>();

        BufferedReader r = new BufferedReader(new FileReader(file));
        String tmp = null;
        while((tmp = r.readLine())!=null){
            System.out.println(tmp);
            list.add(tmp); //recording to list
        }
        r.close();

        PrintWriter w = new PrintWriter(new FileOutputStream(file));
            for(String s:list){
                w.println("John");
                w.println("Peter");
            }
        w.println("John"); //запись в файл
        w.println("Peter");
        w.close();*/

        User u1 = new User("Ivan", 18);

        //serialize

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)); //сериализация
        oos.writeObject(u1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)); //десериализация
        User user = (User)ois.readObject();
        ois.close();

        System.out.println(user.getName() + " " + user.getAge());



    }
}
