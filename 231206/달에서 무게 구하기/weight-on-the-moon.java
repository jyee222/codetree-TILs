public class Main {
    public static void main(String[] args) {
        double a = 13;                                       // int a = 13;
        double b = 0.165;

        double c = a * b;                                    // 삭제

        System.out.printf("%.0f * %.6f = %.6f", a, b, c);    // ("%d * %.6f = %.6f", a, b, a * b)
    }
}
