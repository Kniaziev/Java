package Lesson7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Generic почитать
// Динамически передаваемые типы
//TE типы будут переданы в момент создания.
public class Lesson7{ //generic
    public static void main(String[] args) {
        /*  private T s;

    public T getS() {
        return s;
    }
    public void setS(T s) {
        this.s = s;
    }
    */
        /*
        Hran <Integer, Integer> h1 = new Hran<>();
        h1.setS(67);
        h1.setE(12);
        Integer i = h1.getS();

        Hran <String, Double> h2 = new Hran<>();
        h2.setS("GG");
        h2.setE(2.0);
        System.out.println(h1);
*/
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll.size());

        System.out.println(ll.size());
        for (int i = 0; i<10; i++){
            ll.add(i+1);
        }
        System.out.println(ll.size());
        for(int i =0; i<ll.size();i++){
            System.out.println(ll.get(i));


        }
        ll.add(5, 20);
        System.out.println(ll.get(5));

        LinkedList<Integer> li2 = (LinkedList<Integer>) ll.clone(); //клонирование линкед листа

        System.out.println(li2.size());ll.add(5, 20);

        List<Integer> arr = new ArrayList<>();
        for(int i =0; i< arr.size(); i++){
            arr.add(i, arr.get(i));
        }



}
}
//Домашнее задание:
//
//создать список объектов класса юзер, у которых будет имя и возраст.
//вывод этого списка юзеров (Имя,возраст); вывод в строку.
//
//
//
//