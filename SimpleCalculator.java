
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first operand");
		int firstOperand=sc.nextInt();
		System.out.println("Enter second operand");
		int secondOperand=sc.nextInt();
		System.out.println("Enter operator");
		char c=sc.next().charAt(0);
		int result=0;
		if(c!='+' && c!='-' && c!='*' && c!='/' && c!='%')
		{
			System.out.println("Not a valid operator");
		}
		else
		{
		if(c=='+')
		{
			result=firstOperand+secondOperand;
		}
		else if(c=='-')
		{
			result=firstOperand-secondOperand;
		}
		else if(c=='*')
		{
			result=firstOperand*secondOperand;
		}
		else if(c=='/')
		{
			result=firstOperand/secondOperand;
		}
		else if(c=='%')
		{
			result=firstOperand%secondOperand;
		}
		System.out.println("Result Of the Operation :"+(result));
		}
	}

}
