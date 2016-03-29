package NamesList;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamesList {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter your name: ");

        Scanner sc = new Scanner(System.in); //input
        String s = null;
        s = sc.nextLine(); //read string

        File f = new File("names.txt");
        //f.createNewFile();

        List<String> l = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String tmp;
        while((tmp = br.readLine())!=null){
            l.add(tmp);

        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileOutputStream(f));
        for (String str: l){
            pw.println(str);
            }
        pw.println(s);
        pw.close();

        System.out.println("Registered users are:");
        BufferedReader br1 = new BufferedReader(new FileReader(f));
        String tmp1;
        while((tmp1=br1.readLine())!= null){
            System.out.println(tmp1);
        }
        br1.close();
        }
    }

//HOMETASK
// check input and output streams
// сделать сериалайзбл и записывать в файл не просто имена а объекты (имя/возраст)

//хотите ли вы ввести имя? если у - делаем. если нет, то вывести список зарегистрированных юзеров

//в самом начале "хотите ли вы очистить файл?"  Если инфы нет, то сразу "введите ваше имя"