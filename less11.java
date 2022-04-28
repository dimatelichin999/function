import java.util.Scanner;

public class less11 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int c = in.nextInt();
        int d = in.nextInt();

        int n = in.nextInt();
        int m = in.nextInt();

        if (a > 0) {
            if (a <= 23) {
                if (b > 0) {
                    if (b <= 59) {
                        if (c > 0) {
                            if (c <= 23) {
                                if (d > 0) {
                                    if (d <= 59) {
                                        if (n > 0) {
                                            if (n <= 23) {
                                                if (m > 0) {
                                                    if (m <= 59) {

                                                        int x = (a * 60) + b;
                                                        int y = (c * 60) + d;
                                                        int q = (n * 60) + m;

                                                        if (q > x) {
                                                            if (q < y) {
                                                                System.out.println("Людина встигла на поїзд");
                                                            } else {
                                                                System.out.println("Людина запізнилась на поїзд");
                                                            }
                                                        } else {
                                                            System.out.println("Хай стоїть і чекає далі на поїзд");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
