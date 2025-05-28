
public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading mv=new MethodOverloading();
		System.out.println("The add method with 2 int parameters "+mv.add(2,5));
		System.out.println("The add method with 2 double parameters "+mv.add(2.0,5.0));
		System.out.println("The add method with 3 int parameters "+mv.add(2,5,9));
	}
	int add(int num1,int num2)
	{
		return num1+num2;
	}
    double add(double num1,double num2)
	{
		return num1+num2;
	}
    int add(int num1,int num2,int num3)
    {
    	return num1+num2+num3;
    }
}
/*output :
The add method with 2 int parameters 7
The add method with 2 double parameters 7.0
The add method with 3 int parameters 16*/
