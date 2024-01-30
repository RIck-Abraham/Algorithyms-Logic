import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String str = scnr.nextLine();

        String[] arrOfStr = str.split(" ", 5);

        for (String a : arrOfStr){
            System.out.println(a);
        }
    }
}
