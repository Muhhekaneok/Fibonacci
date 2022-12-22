import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printFibonacciNumber(10);
        System.out.println("\n---------------------------------");
        System.out.println(printFibonacciNumberByList(10));
        System.out.println("\n---------------------------------");
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

    public static List<Integer> printFibonacciNumberByList(int digit) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(0);
        arrList.add(1);
        for (int i = 2; i <= digit; i++) {
            arrList.add(arrList.get(i - 1) + arrList.get(i - 2));
        }
        int result = arrList.get(arrList.size() - 1);
        System.out.println("max value = " + result);
        return arrList;
    }
}