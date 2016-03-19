package ListOfObjects;
import java.util.ArrayList;

public class Printer {
    public static void main(String[] args) {
        ArrayList<User> Users = new ArrayList<>();
            User vadim = new User("Vadim", 29);
            User sasha = new User("Sasha", 30);
            User roman = new User("Roman", 31);
            User andrew = new User("Andrew", 83);

                Users.add(vadim);
                Users.add(sasha);
                Users.add(roman);
                Users.add(andrew);

                for (int i = 0; i < Users.size(); i++){
                System.out.printf("%s %d, ", Users.get(i).getName(), Users.get(i).getAge());
        }
    }
}


