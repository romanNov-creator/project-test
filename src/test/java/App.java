public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(sum(a, b));
        System.out.println(div(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a - b;
    }

    public static void method() {
        System.out.println("This is method");
    }
}
