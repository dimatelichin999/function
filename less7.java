import java.util.Scanner;

public class less7 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        if (a < c ){
            if ( b < d ){
                System.out.println("Прямокутник поміщається в інший");
            }
            else {
                System.out.println("Прямокутник не поміщається в інший");
            }
        }
        else {
            System.out.println("Прямокутник не поміщається в інший");
        }
    }
}
