public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a + b = " + (a + b));
        sum(a, b);
        System.out.println("a + b = " + (a + b));
    }

    public static int sum(int a, int b) {
        a = 5;
        b = 10;
        int с = sum(a, b);
        return с;
    }
}