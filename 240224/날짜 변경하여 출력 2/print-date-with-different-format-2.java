import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split("-");
        
        int year = Integer.parseInt(parts[2]);
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        
        System.out.println(year + "." + month + "." + day);
    }
}