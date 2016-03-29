package HomeTask;


public class ClassTwo {
    public static void main (String[] args){

        //PrintMethod1();
        ClassTwo cde = new ClassTwo();
        cde.PrintMethod1();
       // ClassTwo.SecondMethod();

    }
    void PrintMethod1(){
        System.out.println("PrintMethod1");
        ClassTwo.SecondMethod();

    }
    public static void SecondMethod(){
        System.out.println("SecondMethod");

   }
}
