package lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Sortirovka s = new Sortirovka();
        int[] mas = {23, 6, 51, 12, 100, 2};
        int[] m = s.vstavka(mas);
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i]);
        }
        
        
        for(int i = 0; i < 6; i++){
            if(i == 2){
                continue;
            }
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
        
        NewClass n = new NewClass();
        n.setName("Fedor");
        //n.setAge(18);
        System.out.println(n.getName());
        
        String[] mass = {"Ivan", "Fedor"};
        NewClass n1 = new NewClass(mass);
        System.out.println(n1.getName());
        
        System.out.println(n.sq(7, 9));
        
        int a = 5;
        int b = 5;
        if(a==b){
            System.out.println(n.sq(a));
        }else{
            System.out.println(n.sq(a, b));
        }
        System.out.println(n.toString());
        
        
        A first = new A("quattro", 123);
        B second = new B(true, "w220", 234);
        B third = new B(true, "w2200", 234);
        System.out.println(second.toString());
        System.out.println(second.equals(third));
    }
}
