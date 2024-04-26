public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Hello!");

        System.out.println(getSum(1, 2));
        System.out.println(getSumSum(1, 2, 3));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSumSum(int a, int b, int c) {
        return a + b + c;
    }
}
