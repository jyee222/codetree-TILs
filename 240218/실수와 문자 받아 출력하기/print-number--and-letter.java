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
    
    // Scanner sc = new Scanner(System.in);

    //     변수 선언
    //     char a;
    //     double b, c;

    //     입력
    //     a = sc.next().charAt(0);

    //     b = sc.nextDouble();
    //     c = sc.nextDouble();

    //     출력
    //     System.out.println(a);
    //     System.out.printf("%.2f\n%.2f", b, c);
}
