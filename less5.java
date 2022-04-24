import java.util.Scanner;

public class less5 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        getResult(a,b,c);
    }
    public static void getResult(double a , double b, double c){

        if (a < b){
            if (b < c){
                System.out.println("рівність є правильною");
            }
            else {
                System.out.println("рівність не є правильною");
            }
        }
        else {
            System.out.println("рівність не є правильною");
        }
    }
}
