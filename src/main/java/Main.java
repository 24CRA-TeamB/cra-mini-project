public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Hello!");

        System.out.println("제곱: "+ getZegop(3));
        System.out.println("3 * 8 = " + getGop(3, 8));
        System.out.println(getSum(1, 2));
        System.out.println(getSumSum(1, 2, 3));
    }

    public static int getMinus(int a, int b) {
        return a - b;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSumSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getGop(int a, int b){
        return a * b;
    }

    public static int getDivide(int a, int b) {
        return a / b;
    }

    private static int getZegop(int a) {
        return a*a;
    }
}
