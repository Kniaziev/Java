package Lists;

public class MainClass {
    public static void main(String[] args) {
        OurList list = new ourArrayList();
        //System.out.println(list.size());
        list.add(5);//0
        list.add(7);//1
        list.add(3);//2
        list.add(6);//3
        System.out.println("Here should be 7" + list.get(1));
        for (int i= 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.add(3,8);


        for (int i= 0; i<list.size();i++){
            System.out.println("index "+ i +" now value is "+list.get(i));}

        list.remove(4);
        for (int i= 0; i<list.size();i++){
            System.out.println("after remove index "+ i +" now value is "+list.get(i));}


    }


}
