import java.util.Scanner;

public class less3 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        getResult(x);
    }
    public static void getResult(int x){

        if (x>=-5) {
            if (x <= 3){
                System.out.println("Число " + x + "Лежить в проміжутку [-5;3]");
            }
            else  System.out.println("Число " + x + " Не лежить в проміжутку [-5;3]");
        }
        else {
            System.out.println("Число " + x + " Не лежить в проміжутку [-5;3]");
        }
    }
}
