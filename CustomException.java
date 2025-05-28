
import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your age");
        int age = sc.nextInt(); 

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            } else {
                System.out.println("Valid age.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
/*output :
enter your age
16
Exception caught: Age must be 18 or older.*/
