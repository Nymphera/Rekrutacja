package Other;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //W różnych źródłach podaję się pierwzy element ciągu jako 0 lub 1. Ja zdecydowałąm się użyć tej
        // pierwszej wersji, Aby uzyskać wynk dla ciągu od 1 wystarczyłoby zmienić wartości licby lub w pętli użyć i<=n
        System.out.println("Insert your number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        findAndPrintFibnacciElement(n);
    }

    private static void findAndPrintFibnacciElement(int n) {
        int first = 0;
        int second = 1;
        int next = 1;
        if (n == 1) {
            System.out.println(first);
        } else {
            for (int i = 2; i < n; i++) {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(second);
        }
    }
}
