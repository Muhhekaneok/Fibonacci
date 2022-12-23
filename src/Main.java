import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int digit = 10;
        printFibonacciNumber(digit);
        System.out.println("\n---------------------------------");
        System.out.println(printFibonacciNumberByList(digit));
        System.out.println("\n---------------------------------");
        System.out.println(printFibonacciElementByRecursion(digit));
        System.out.println("\n---------------------------------");
        System.out.println(printFibonacciStream(digit));
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

    public static int printFibonacciElementByRecursion(int digit) {
        if (digit <= 1) return digit;
        return printFibonacciElementByRecursion(digit - 1) + printFibonacciElementByRecursion(digit - 2);
    }

    public static long printFibonacciStream(int element) {
        var result = Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
                .limit(element)
                .map(y -> y[1])
                .max(Long::compareTo);
        return result.orElseThrow(IllegalArgumentException::new);
    }
}