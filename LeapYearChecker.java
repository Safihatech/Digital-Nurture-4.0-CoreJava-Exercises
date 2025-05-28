
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}

/*output :

Case Leap Year:
Enter a year: 2024
2024 is a Leap Year.

Case Non Leap Year:
Enter a year: 2010
2010 is Not a Leap Year.*/
