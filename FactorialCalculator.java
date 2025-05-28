
import java.util.*;
public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a number");
		int number=sc.nextInt();
		int res=1;
		for(int i=number;i>=1;i--)
		{
			res*=i;
		}
		System.out.println("factorial of "+number +" is "+res);
	}

}
/*output :
enetr a number
5
factorial of 5 is 120*/
