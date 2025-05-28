
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int number=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"X"+i+"="+(number*i));
		}
	}

}
/*output :
please enter a number
5
5X1=5
5X2=10
5X3=15
5X4=20
5X5=25
5X6=30
5X7=35
5X8=40
5X9=45
5X10=50*/