package Lesson8;
//errors has higher priority than method

public class NewClass {
    double a(int x, int y){
        int [] arr = new int [5];

        try {
            int z = arr[2];
            return x / y;
        }
        catch (ArithmeticException e){
            System.out.println("do not divide on 0 " + e);
            e.printStackTrace(); //выводит ошибку для информации
        }catch(ArrayIndexOutOfBoundsException e)  {
            System.out.println("wrong index access error ");
            e.printStackTrace();
        }finally {
            System.out.println("finjhjkally");
        }
        return 0;
    }
}
