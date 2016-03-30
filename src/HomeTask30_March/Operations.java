/*
package HomeTask30_March;

import java.io.*;


public class Operations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Вася", 15);
        //create file
        File file = new File("store.bin");

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);

        so.writeObject(user);
        so.flush();
        so.close();
        //read file
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream si = new ObjectInputStream(fi);
        User user2 = (User) si.readObject();
        si.close();
        System.out.println(user2);


    }
}
*/
