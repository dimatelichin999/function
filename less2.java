import java.util.Scanner;

public class less2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();


        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        getResult1(x, y, x1, y1);


    }
    public static void getResult1(double x,double y,double x1,double y1){

        double x2 = x / x1;
        double y2 = y / y1;

        double a = x2 * y2;


        double x3 = x / y1;
        double y3 = y / x1;

        double b = x3 * y3;
        getResult3(a,b);
    }
    public static void getResult3(double a,double b ){

        if (a > b){
            System.out.println("Прямокутник а має більше кусків чим прямокутник b");

        }
        else if (b > a){

            System.out.println("Прямокутник b має більше кусків чим прямокутник a");
        }
        else {
            System.out.println("Прямокутник a і b мають рівну кількість кусочків");
        }
    }
}
