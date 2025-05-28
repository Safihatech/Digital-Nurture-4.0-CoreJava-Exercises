
import java.util.*;
public class EvenOrOddChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(number<0)
		{
			System.out.println("Please enter positive number");
		}
		else
		{
			if(number%2==0)
			{
				System.out.println(number +" is even number");
			}
			else
			{
				System.out.println(number +" is odd number");
			}
		}
	}

}

/*output:
Case Positive :
Enter a number
4
4 is even number

case Negative:
Enter a number
9
9 is odd number

Case Invalid:
Enter a number
-4
Please enter positive number*/
