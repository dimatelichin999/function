import java.util.Scanner;

public class less14 {

    public static void main(String args[]){

        Scanner in  = new Scanner(System.in);
        int x = in.nextInt();

        if (x < -1){
            System.out.println(-1);
        }
        else if (x > -1){
            System.out.println(x);
        }
        else {
            System.out.println(1);
        }
    }
}
