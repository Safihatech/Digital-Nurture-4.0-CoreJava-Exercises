
import java.util.*;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else {
            System.out.println("Fibonacci(" + num + ") = " + fibonacci(num));
        }
    }

    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
/*output :
Enter a non-negative number
6
Fibonacci(6) = 8*/