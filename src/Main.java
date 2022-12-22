public class Main {
    public static void main(String[] args) {
        printFibonacciNumber(10);
    }

    public static void printFibonacciNumber(int digit) {
        int f0 = 0;
        int f1 = 1;
        System.out.print(f0 + " " + f1 + " ");
        for (int i = 2; i <= digit; i++) {
            int fFibo = f0 + f1;
            System.out.print(fFibo + " ");
            f0 = f1;
            f1 = fFibo;
        }
    }
}