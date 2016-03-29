package Calc;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        calc.firstNum = input.nextDouble();
        System.out.println("Enter action");
        String act = input.next();
        calc.action = act.charAt(0);
        System.out.println("Enter second number:");
        calc.secondNum = input.nextDouble();
        System.out.println("Answer is :" + calc.summariazer(calc.action));

    }
}
