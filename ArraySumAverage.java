
import java.util.*;
public class ArraySumAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter array elements");
		int sum=0;
		int average=0;
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.println("The sum Of array elements: "+sum);
		System.out.println("The average Of array elements: "+(sum/size));
	}

}
/*output :
enter size of the array
5
enter array elements
1 4 2 6 4
The sum Of array elements: 17
The average Of array elements: 3*/
