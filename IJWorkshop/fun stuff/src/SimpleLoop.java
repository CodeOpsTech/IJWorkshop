package start;

public class SimpleLoop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }

        System.out.println("after swap");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
