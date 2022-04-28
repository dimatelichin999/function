import java.util.Scanner;

public class less9 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        getResult(a,b,c);
        getResult2(a,b,c);
    }
    public static void getResult(double a, double b, double c){

        double sin = Math.toDegrees(a / c);
        double sina = Math.toDegrees(b / c);
        double s = sina + sin;
       if (s == 90){
           System.out.println("Гострокутник");
       }
       else if  (s < 90){
           System.out.println("Тупокутник");
       }
       else {
           System.out.println("Це не трикутник" );
       }

    }
    public static void getResult2(double a, double b, double c){

        if (a == b ){
            if (c > a)
            System.out.println("Рівнобедрений трикутник");

        }
        if ( a == b){
            if (a == c){
                 System.out.println("Рівносторонній трикутник");
            }
        }

        if ( a != b){
            if ( b != c){
                if (c != a){
                    System.out.println("Різностороній");
                }
            }


        }

    }
}
