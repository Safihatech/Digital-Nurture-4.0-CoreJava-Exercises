
import java.util.*;
import java.math.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rand=(int)(Math.random() * 100) + 1;
		if(num==rand)
		{
			System.out.println("Your guess is correct");
		}
		else
		{
		boolean b=true;
		while(b)
		{
			if(num>rand)
			{
				System.out.println("your Guess is too high \nenter a number");
				num=sc.nextInt();
			}
			if(num<rand)
			{
				System.out.println("your Guess is too low \nenter a number");
				num=sc.nextInt();
			}
			if(num==rand)
			{
				b=false;
				System.out.println("Your guess is correct");
			}
		}
		}
	}

}

/*output:
Enter a number
19
your Guess is too low 
enter a number
13
your Guess is too low 
enter a number
56
your Guess is too high 
enter a number
35
your Guess is too low 
enter a number
46
your Guess is too high 
enter a number
38
your Guess is too low 
enter a number
40
your Guess is too low 
enter a number
41
Your guess is correct*/
