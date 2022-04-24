import java.util.Scanner;

public class less6 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        getResult1(a,b,c);
        getResult2(a,b,c);
    }
    public static void getResult1(double a , double b, double c) {

        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    if (b == c) {
                        if (b != a) {
                            System.out.println("Даний трикутник є рівнобедреним");
                        } else {
                            System.out.println("Даний трикутник є не рівнобедреним");
                        }

                    }
                    else {
                        System.out.println("Даний трикутник є не рівнобедреним");
                    }
                }
            }
        }
    }
    public static void getResult2(double a , double b, double c) {

        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    if (a == b) {
                        if (b == c) {
                            if (c == a) {
                                System.out.println("Даний трикутник є рівносторонім");
                            } else {
                                System.out.println("Даний трикутник не є рівносторонім");
                            }

                        } else {
                            System.out.println("Даний трикутник не є рівносторонім");
                        }
                    } else {
                        System.out.println("Даний трикутник не є рівносторонім");

                    }
                }
            }
        }}}






