import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        h = (h + 1) % 24;    // -> 이거 생략하고 출력 : System.out.println((h + 1) + ":" + m);
        
        System.out.printf("%d:%d\n", h, m);
    }
}
