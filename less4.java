import java.util.Scanner;

public class less4 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x>=-2) {
            if (x <= 5){
                double y = Math.sin(x);
                System.out.println("Число " + y );
            }
            else  System.out.println("Число " + 1 );
        }
        else {
            System.out.println("Число " + 1 );
        }
    }
}
