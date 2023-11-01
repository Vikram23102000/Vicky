import java.util.Scanner;
class currencyconverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter amount in rupees");
		double inr = sc.nextDouble();
		rupeetodollar(inr);
	}

	public static void rupeetodollar(double rupee) 
	{
		double dollar = rupee/82.31;
		System.out.println(dollar);
		dollartoeuro(dollar);
	}

	public static void dollartoeuro(double dollar) 
	{
		double euro = dollar*0.92;
		System.out.println(euro);
		eurotodirham(euro);
	}

	public static void eurotodirham(double euro) 
	{
		double dirham = euro*3.93;
		System.out.println(dirham);
		dirhamtopound(dirham);
	}

	public static void dirhamtopound(double dirham) 
	{
		double pound = dirham*0.22;
		System.out.println(pound);
	}




}
