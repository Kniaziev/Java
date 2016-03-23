package Lesson8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson8 {
    public static void main(String[] args) {
       /* NewClass nc = new NewClass();
        System.out.println(nc.a(10,0));
        */

        List<Integer> list = new ArrayList<>(); // создание списка
       // int arr[] = {1, 2, 3, 4, 5};
        /*try {
            list.add(4, 5);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(list.get(5) + "aaa");
        */
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<Integer> iter = list.iterator();
        for(Integer i:list) //удобная пробежк а по списку/массиву
        //while(iter.hasNext()){
           // System.out.println("Iterator "+iter.next());
            System.out.println("for :"+ i);
        }
    }


//set и list отличаются тем, что в сет нет индексов и все значения уникальные.