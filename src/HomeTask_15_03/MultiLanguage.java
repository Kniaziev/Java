package HomeTask_15_03;

import java.util.Scanner;

public class MultiLanguage{

    public static void main(String[]args){

        Select sel = new Select();
        String message = sel.dialog();
        sel.selectorStr(message);

        //Scanner input = new Scanner(System.in);
       /* System.out.println("Hello! You can choose English (button 'e'), German (button 'g')\n" +
               "  and French (button 'f'). Choose your language.");
        String s = input.next();
        char c = s.charAt(0);
        sel.selector(c);
        String message = input.next();
        sel.dialogNext(message);*/

    }
}