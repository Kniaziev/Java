package Calc;


public class Calculation {
    char action;
    static double firstNum, secondNum, result;

    public static double summariazer(char action){
    switch (action){
        case '+':
            return result =firstNum + secondNum;
        case '-':
            return result = firstNum - secondNum;
        case '*':
            return result = firstNum * secondNum;
        case '/':
            return result =  firstNum / secondNum;
        default:
            System.out.println("Enter a valid action please");
            break;
        }
        return 0;
    }
}

