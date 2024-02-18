import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        System.out.println(a);
        System.out.printf("%.2f\n", b);
        System.out.printf("%.2f\n", c);

    }
}