package HomeTask30_March;

import javax.swing.*;

class Select {


    String message;
    public String dialog (){
        message = JOptionPane.showInputDialog(null, "Hello! Do you want to enter your name?\n" +
                "  please type \"yes\" or \"no\"");
        return message;
    }

    public void selectorStr(String message){
        switch (message){
            case "yes":

                break;

            case "no":

                break;

        }
    }
}
