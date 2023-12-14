public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 0;

        c = a;
        a = b;
        b = c;
        
        System.out.println(a);
        System.out.println(b);
    }
}