import java.util.Scanner;

public class less10 {

    public static void main(String args[]) {

        int n1 = 1;
        int n2 = 99;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        getYears(n1, n2, n);
    }

    public static void getYears(int n1, int n2, int n) {
        if (n != 0) {
            if (n < n2) {


                if (n == n1) {
                    System.out.println("Мне" + n + "год");
                } else if (n <= 4) {
                    System.out.println("Мне" + n + "года");
                } else {
                    System.out.println("Мне" + n + "лет");
                }

            } else {
                System.out.println("Ви безсмерний?");
            }
        }
        else {
            System.out.println("Вас немає ще");
        }
    }
}