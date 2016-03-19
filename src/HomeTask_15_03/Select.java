package HomeTask_15_03;

import javax.swing.*;

public class Select {

    //char c;
    String message;
    public String dialog (){
        message = JOptionPane.showInputDialog(null, "Hello! You can choose English (button 'e'), German (button 'g')\n" +
                "  and French (button 'f'). Choose your language.");
        return message;
    }

   /* public void selector(char c){
        switch (c){
            case 'e':
                English en = new English();
                en.helloAbstract();
                break;
            case 'g':
                German ger = new German();
                ger.helloAbstract();
                break;
            case 'f':
                French fr = new French();
                fr.helloAbstract();
                break;
            default:
                Abstract.defaultHello();
                break;
        }
    }*/
    public void selectorStr(String message){
        switch (message){
            case "e":
                English en = new English();
                en.helloAbstract();
                break;
            case "g":
                German ger = new German();
                ger.helloAbstract();
                break;
            case "f":
                French fr = new French();
                fr.helloAbstract();
                break;
            default:
                Abstract.defaultHello();
                break;
        }
    }

}
