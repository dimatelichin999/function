import java.util.Scanner;

public class less1 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int x2 = (int) Math.pow(x,2);
        int x3 = x*x;

        if (x2>x3){

            System.out.println("не правда");
        }
        else if (x3>x2){

            System.out.println("не правда");
        }
        else {

            System.out.println("Правда");
        }
    }
}
