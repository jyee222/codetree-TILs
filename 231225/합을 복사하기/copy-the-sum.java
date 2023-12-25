public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        int sum = a + b + c;

        a = sum;
        b = sum;
        c = sum;

        // 값 변경
        // a = b = c = a + b + c;

        System.out.println(a + " " + b + " " + c);

    }
}