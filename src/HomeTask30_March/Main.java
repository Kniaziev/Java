package HomeTask30_March;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList <Profile> profiles = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //File file = new File()

        Select sel = new Select();
        String message = sel.dialog();
        sel.selectorStr(message);


        profiles = (ArrayList<Profile>) deserData("profiles");
        Profile profile = new Profile();
        profile.setName(JOptionPane.showInputDialog(null, "Enter your name"));
        profile.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age")));
        profiles.add(profile);
        for(Profile p : profiles){
            System.out.println(p.getName() +" "+ p.getAge());
        }
        serData("profiles", profiles);

    }
    private static Object deserData(String filename) throws IOException, ClassNotFoundException {
        Object retObject = null;

        FileInputStream fileIn = new FileInputStream(filename+".ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        retObject = in.readObject();
        fileIn.close();
        in.close();

        return  retObject;
    }
    private static void serData(String filename, Object obj) throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream(filename+".ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        fileOut.close();
        out.close();
    }
}
