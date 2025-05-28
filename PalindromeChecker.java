
import java.util.*;
public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int i=0;
		boolean ispalin=true;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				ispalin=false;
				System.out.println("The String "+s+"is Not palindrome");
				break;
			}
			i++;
			j--;
		}
		if(ispalin)
		{
			System.out.println("The String "+s+"is palindrome");
		}
	}

}

/*output :
enter a string
madam
The String madamis palindrome*/

