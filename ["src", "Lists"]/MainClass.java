package Lists;

public class MainClass {
    public static void main(String[] args) {
        /*OurList list = new OurArrayList();
        //System.out.println(list.size());
        list.add(5);//0
        list.add(7);//1
        list.add(3);//2
        list.add(6);//3
        System.out.println("Here should be 7" + list.get(1));
        for (int i= 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.add(4,8);


        for (int i= 0; i<list.size();i++){
            System.out.println("index "+ i +" now value is "+list.get(i));}

        list.remove(4);
        for (int i= 0; i<list.size();i++){
            System.out.println("after remove index "+ i +" now value is "+list.get(i));}*/

        OurLinkedList linked = new OurLinkedList();

        System.out.println(linked.size());

        linked.add(5);//0
        linked.add(7);//1
        linked.add(3);//2
        linked.add(6);//3
        for (int i= 0; i<linked.size();i++){
            System.out.println("linked "+linked.get(i));}
        linked.remove(2);

        System.out.println(linked.size());



    }


}
